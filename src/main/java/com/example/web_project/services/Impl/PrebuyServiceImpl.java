package com.example.web_project.services.Impl;



import com.example.web_project.entities.*;
import com.example.web_project.repository.*;
import com.example.web_project.services.PrebuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class PrebuyServiceImpl implements PrebuyService {

    @Autowired
    private BillRepository billRepository;

    @Autowired
    private BillInfoRepository billinfoRepository;


    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private DrinkcostRepository drinkCostRepository;
    @Autowired
    private DrinktypeRepository drinktypeRepository;



    @Override
    @Transactional
    public void addToOrder(Product idProduct, int count, int idSize, int idAddin, int idFoam, int idTopping, int idAccount) {

        System.out.println("Vao ham add to order");
        // Kiểm tra xem có tồn tại Bill chưa được thanh toán (paid = false) hay không
        Optional<Bill> bill = billRepository.findUnpaidBillByAccountId(idAccount).stream().findFirst();

        Bill existingBill = bill.orElse(null);

        if (existingBill != null) {
            System.out.println("case existingBill");
            // Nếu có, sử dụng Bill hiện tại để tạo BillInfo mới
            createBillInfo(existingBill, idProduct, count, idSize,idAddin,idFoam,idTopping);
        } else {
            System.out.println("case not existingBill");
            // Nếu không có, tạo mới một Bill và sử dụng nó để tạo BillInfo mới
            Bill newBill = new Bill();
            Integer accountId = idAccount;
            Account account = accountRepository.findById(accountId).orElse(null);
            newBill.setIdAccount(account);
            newBill.setPaid(false); // Gán paid cho Bill mới

            // Lưu Bill mới để tạo ra idBill
            billRepository.save(newBill);
            // Tạo BillInfo mới sử dụng Bill mới
            createBillInfo(newBill, idProduct, count, idSize, idAddin, idFoam, idTopping);
        }
    }

    private void createBillInfo(Bill bill, Product idProduct, int count, int idSize, int idAddin, int idFoam, int idTopping) {
        // Tạo một Billinfo mới
        Billinfo billInfo = new Billinfo();
        billInfo.setBillID(bill);

        billInfo.setProductID(idProduct);

        // Đặt các thuộc tính khác
        billInfo.setCount(count);

        Drinktype idDrinkType = drinktypeRepository.getDrinkTypeID(idSize, idAddin, idFoam, idTopping);
        billInfo.setDrinkTypeID(idDrinkType);

        // Lưu Billinfo để tạo ra idBillInfo
        billinfoRepository.save(billInfo);
    }

    @Override
    public Drinktype getDrinkTypeID(int idSize, int idAddin, int idFoam, int idTopping) {
        return drinktypeRepository.getDrinkTypeID(idSize, idAddin, idFoam, idTopping);
    }

}