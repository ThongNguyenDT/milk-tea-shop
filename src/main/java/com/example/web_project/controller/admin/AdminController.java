package com.example.web_project.controller.admin;

import com.example.web_project.services.AdminService;
import com.example.web_project.services.Impl.admin.AdminFourYearPerResponse;
import com.example.web_project.services.Impl.admin.AdminImcomenProfitResponse;
import com.example.web_project.services.Impl.admin.AdminMonthlyRevenueResponse;
import com.example.web_project.services.Impl.admin.AdminTotalResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @Autowired
    public final AdminService adminService;

    @PostMapping("/total")
    public ResponseEntity<AdminTotalResponse> getTotal(){
        return ResponseEntity.ok(adminService.getTotal());
    }

    @PostMapping("/earn_of_this_year")
    public ResponseEntity<List<AdminMonthlyRevenueResponse>> getEarnOfThisYear(){
        return ResponseEntity.ok(adminService.getEarnOfThisYear());
    }
    @PostMapping("/earn_of_four_year")
    public ResponseEntity<List<AdminFourYearPerResponse>> getEarnOfFourYear(){
        return ResponseEntity.ok(adminService.getEarnOfFourYear());
    }

    @PostMapping("/get_income_profit")
    public ResponseEntity<List<AdminImcomenProfitResponse>> getMonlyIncomenProfit(){
        return ResponseEntity.ok(adminService.getMonlyIncomenProfit());
    }


}
