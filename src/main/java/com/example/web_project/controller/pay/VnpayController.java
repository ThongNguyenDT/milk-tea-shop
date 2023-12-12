package com.example.web_project.controller.pay;

import com.example.web_project.config.ConfigVnpay;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;



@Controller
public class VnpayController {

    @GetMapping("/pay")
    public String getPay(@RequestParam("totalPayment") String totalPayment) throws UnsupportedEncodingException {
        long amount = Long.parseLong(totalPayment) * 100;

        String vnp_Version = "2.1.0";
        String vnp_Command = "pay";
        String orderType = "other";

        String vnp_TxnRef = ConfigVnpay.getRandomNumber(8);
        String vnp_IpAddr = "127.0.0.1";
        String vnp_TmnCode = ConfigVnpay.vnp_TmnCode;

        Map<String, String> vnp_Params = new HashMap<>();
        vnp_Params.put("vnp_Version", vnp_Version);
        vnp_Params.put("vnp_Command", vnp_Command);
        vnp_Params.put("vnp_TmnCode", vnp_TmnCode);
        vnp_Params.put("vnp_Amount", String.valueOf(amount));


        vnp_Params.put("vnp_TxnRef", vnp_TxnRef);
        vnp_Params.put("vnp_OrderInfo", "Thanh toan don hang:" + vnp_TxnRef);
        vnp_Params.put("vnp_OrderType", orderType);

        vnp_Params.put("vnp_Locale", "vn");
        vnp_Params.put("vnp_ReturnUrl", "http://localhost:8080/thanh-toan-thanh-cong-view");
        vnp_Params.put("vnp_IpAddr", vnp_IpAddr);

        Calendar cld = Calendar.getInstance(TimeZone.getTimeZone("Etc/GMT+7"));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String vnp_CreateDate = formatter.format(cld.getTime());
        vnp_Params.put("vnp_CreateDate", vnp_CreateDate);

        cld.add(Calendar.MINUTE, 15);
        String vnp_ExpireDate = formatter.format(cld.getTime());
        vnp_Params.put("vnp_ExpireDate", vnp_ExpireDate);

        List fieldNames = new ArrayList(vnp_Params.keySet());
        Collections.sort(fieldNames);
        StringBuilder hashData = new StringBuilder();
        StringBuilder query = new StringBuilder();
        Iterator itr = fieldNames.iterator();
        while (itr.hasNext()) {
            String fieldName = (String) itr.next();
            String fieldValue = (String) vnp_Params.get(fieldName);
            if ((fieldValue != null) && (fieldValue.length() > 0)) {
                //Build hash data
                hashData.append(fieldName);
                hashData.append('=');
                hashData.append(URLEncoder.encode(fieldValue, StandardCharsets.US_ASCII.toString()));
                //Build query
                query.append(URLEncoder.encode(fieldName, StandardCharsets.US_ASCII.toString()));
                query.append('=');
                query.append(URLEncoder.encode(fieldValue, StandardCharsets.US_ASCII.toString()));
                if (itr.hasNext()) {
                    query.append('&');
                    hashData.append('&');
                }
            }
        }
        String queryUrl = query.toString();
        String vnp_SecureHash = ConfigVnpay.hmacSHA512(ConfigVnpay.secretKey, hashData.toString());
        queryUrl += "&vnp_SecureHash=" + vnp_SecureHash;
        String paymentUrl = ConfigVnpay.vnp_PayUrl + "?" + queryUrl;
        // Chuyển hướng đến paymentUrl, bạn có thể cần trả về một ModelAndView thay vì String
        return "redirect:" + paymentUrl;
    }
    @RequestMapping("/thanh-toan-thanh-cong-view")
    public ModelAndView thanhToanThanhCong(@RequestParam Map<String, String> params) {
        ModelAndView modelAndView = new ModelAndView("thanh-toan-thanh-cong-view");

        // Trong phương thức thanhToanThanhCong
        modelAndView.addObject("vnp_Params", params);

        // Validate the response and perform necessary actions
        if (validateResponse(params)) {
            // Thanh toán thành công, bạn có thể trích xuất thông tin từ params và truyền nó vào view
            modelAndView.addObject("amount", params.get("vnp_Amount"));
            modelAndView.addObject("bankCode", params.get("vnp_BankCode"));

            // Thêm các dòng sau để trích xuất và truyền tên chủ thẻ và mã giao dịch
            modelAndView.addObject("cardHolder", params.get("vnp_CardHolder"));
            modelAndView.addObject("transactionCode", params.get("vnp_TransactionNo"));

            // Thêm dòng mã để truyền mã giao dịch và số tiền vào view
            modelAndView.addObject("vnp_TxnRef", params.get("vnp_TxnRef"));
            modelAndView.addObject("vnp_Amount", params.get("vnp_Amount"));

            // ... (thêm nhiều thuộc tính khác nếu cần)

        } else {
            // Thanh toán thất bại hoặc phản hồi không hợp lệ
            modelAndView.addObject("error", "Thanh toán thất bại hoặc phản hồi không hợp lệ");
        }

        return modelAndView;
    }


    private boolean validateResponse(Map<String, String> params) {
        // Implement your validation logic here, e.g., check vnp_ResponseCode
        // Return true if the response is valid, otherwise return false
        return "00".equals(params.get("vnp_ResponseCode"));
    }
}