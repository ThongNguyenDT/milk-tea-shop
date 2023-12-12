package com.example.web_project.controller.pay;

import com.example.web_project.entities.Viewgiohang;
import com.example.web_project.services.ViewgiohangService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {

    @Autowired
    private final ViewgiohangService viewgiohangService;

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

    @GetMapping("/viewgiohang/byUsername/{username}")
    public ResponseEntity<List<Viewgiohang>> getViewgiohangByUsername(@PathVariable String username) {
        List<Viewgiohang> viewgiohangList = viewgiohangService.getViewgiohangByUsername(username);
        return new ResponseEntity<>(viewgiohangList, HttpStatus.OK);
    }

}
