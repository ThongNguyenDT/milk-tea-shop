package com.example.web_project.controller;

import com.example.web_project.entities.Payment;
import com.example.web_project.entities.Viewgiohang;
import com.example.web_project.services.PaymentService;
import com.example.web_project.services.ViewgiohangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;
    private final ViewgiohangService viewgiohangService;

    @Autowired
    public PaymentController(PaymentService paymentService, ViewgiohangService viewgiohangService) {
        this.paymentService = paymentService;
        this.viewgiohangService = viewgiohangService;
    }

    @GetMapping("/viewgiohang")
    public ResponseEntity<List<Viewgiohang>> getAllViewgiohang() {
        // Lấy danh sách tất cả các Viewgiohang từ service
        List<Viewgiohang> viewgiohangList = viewgiohangService.getAllViewgiohang();
        return new ResponseEntity<>(viewgiohangList, HttpStatus.OK);
    }

    @GetMapping("/viewgiohang/{id}")
    public ResponseEntity<Viewgiohang> getViewgiohangById(@PathVariable Integer id) {
        // Lấy Viewgiohang theo ID từ service
        Viewgiohang viewgiohang = viewgiohangService.getViewgiohangById(id);
        if (viewgiohang != null) {
            return new ResponseEntity<>(viewgiohang, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/viewgiohang")
    public ResponseEntity<Viewgiohang> createViewgiohang(@RequestBody Viewgiohang viewgiohang) {
        // Tạo mới Viewgiohang thông qua service
        Viewgiohang createdViewgiohang = viewgiohangService.createViewgiohang(viewgiohang);
        return new ResponseEntity<>(createdViewgiohang, HttpStatus.CREATED);
    }

    @PutMapping("/viewgiohang/{id}")
    public ResponseEntity<Viewgiohang> updateViewgiohang(@PathVariable Integer id, @RequestBody Viewgiohang updatedViewgiohang) {
        // Cập nhật Viewgiohang thông qua service
        Viewgiohang result = viewgiohangService.updateViewgiohang(id, updatedViewgiohang);
        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/viewgiohang/{id}")
    public ResponseEntity<Void> deleteViewgiohang(@PathVariable Integer id) {
        // Xóa Viewgiohang theo ID thông qua service
        viewgiohangService.deleteViewgiohang(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/viewgiohang/byBill/{billID}")
    public ResponseEntity<List<Viewgiohang>> getViewgiohangByBillID(@PathVariable Integer billID) {
        // Lấy danh sách Viewgiohang theo BillID từ service
        List<Viewgiohang> viewgiohangList = viewgiohangService.getViewgiohangByBillID(billID);
        return new ResponseEntity<>(viewgiohangList, HttpStatus.OK);
    }
    @GetMapping("/checkout")
    public String showCheckoutPage(Model model) {
        List<Viewgiohang> cartInformation = viewgiohangService.getAllViewgiohang();
        model.addAttribute("cartInformation", cartInformation);
        return "checkout";
    }


}
