package com.example.web_project.services;

import com.example.web_project.services.Impl.admin.AdminFourYearPerResponse;
import com.example.web_project.services.Impl.admin.AdminImcomenProfitResponse;
import com.example.web_project.services.Impl.admin.AdminMonthlyRevenueResponse;
import com.example.web_project.services.Impl.admin.AdminTotalResponse;

import java.util.List;

public interface AdminService {

    AdminTotalResponse getTotal();

    List<AdminMonthlyRevenueResponse> getEarnOfThisYear();

    List<AdminFourYearPerResponse> getEarnOfFourYear();
    public List<AdminImcomenProfitResponse> getMonlyIncomenProfit();
}
