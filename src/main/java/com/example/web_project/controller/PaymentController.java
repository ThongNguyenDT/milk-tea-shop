package com.example.web_project.controller;

import com.example.web_project.entities.Viewgiohang;
import com.example.web_project.services.ViewgiohangService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private final ViewgiohangService viewgiohangService;

    @Autowired
    public PaymentController(ViewgiohangService viewgiohangService) {
        this.viewgiohangService = viewgiohangService;
    }

    @GetMapping("/viewgiohang")
    public ResponseEntity<List<Viewgiohang>> getAllViewgiohang() {
        List<Viewgiohang> viewgiohangList = viewgiohangService.getAllViewgiohang();
        return new ResponseEntity<>(viewgiohangList, HttpStatus.OK);
    }

    @GetMapping("/viewgiohang/{id}")
    public ResponseEntity<Viewgiohang> getViewgiohangById(@PathVariable Integer id) {
        Viewgiohang viewgiohang = viewgiohangService.getViewgiohangById(id);
        if (viewgiohang != null) {
            return new ResponseEntity<>(viewgiohang, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/viewgiohang")
    public ResponseEntity<Viewgiohang> createViewgiohang(@RequestBody Viewgiohang viewgiohang) {
        Viewgiohang createdViewgiohang = viewgiohangService.createViewgiohang(viewgiohang);
        return new ResponseEntity<>(createdViewgiohang, HttpStatus.CREATED);
    }

    @PutMapping("/viewgiohang/{id}")
    public ResponseEntity<Viewgiohang> updateViewgiohang(@PathVariable Integer id, @RequestBody Viewgiohang updatedViewgiohang) {
        Viewgiohang result = viewgiohangService.updateViewgiohang(id, updatedViewgiohang);
        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/viewgiohang/{id}")
    public ResponseEntity<Void> deleteViewgiohang(@PathVariable Integer id) {
        viewgiohangService.deleteViewgiohang(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/viewgiohang/byBill/{billID}")
    public ResponseEntity<List<Viewgiohang>> getViewgiohangByBillID(@PathVariable Integer billID) {
        List<Viewgiohang> viewgiohangList = viewgiohangService.getViewgiohangByBillID(billID);
        return new ResponseEntity<>(viewgiohangList, HttpStatus.OK);
    }

    @GetMapping("/checkout")
    public String showCheckoutPage(Model model) {
        List<Viewgiohang> cartInformation = viewgiohangService.getAllViewgiohang();
        model.addAttribute("cartInformation", cartInformation);
        return "checkout";
    }

    @GetMapping("/viewgiohang/byUsername/{username}")
    public ResponseEntity<List<Viewgiohang>> getViewgiohangByUsername(@PathVariable String username) {
        List<Viewgiohang> viewgiohangList = viewgiohangService.getViewgiohangByUsername(username);
        return new ResponseEntity<>(viewgiohangList, HttpStatus.OK);
    }

    @GetMapping("/api/payments/checkout")
    public String showCheckoutPage(Model model, @RequestParam String username) {
        List<Viewgiohang> cartInformation = viewgiohangService.getViewgiohangByUsername(username);
        model.addAttribute("cartInformation", cartInformation);
        return "checkout";
    }
}
