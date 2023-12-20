package com.example.web_project.services.Impl.admin;

import com.example.web_project.entities.Viewbudget;
import com.example.web_project.entities.Viewmonth;
import com.example.web_project.repository.ViewEarnRepository;
import com.example.web_project.repository.ViewMonthRepository;
import com.example.web_project.services.AdminService;
import com.example.web_project.services.ViewBudgetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    @Autowired
    public final ViewMonthRepository viewMonthRepository;

    @Autowired
    public final ViewEarnRepository viewEarnRepository;

    @Autowired
    public final ViewBudgetRepository viewBudgetRepository;

    @Override
    public AdminTotalResponse getTotal() {
        var check = viewMonthRepository.findAll();
        Viewmonth data = new Viewmonth();
        if (!check.isEmpty())
            data = check.getFirst();
        return AdminTotalResponse.builder()
                .Earn(String.valueOf(data.getEarn()))
                .Customers(String.valueOf(data.getCustomers()))
                .Products(String.valueOf(data.getProducts()))
                .build();
    }

    @Override
    public List<AdminMonthlyRevenueResponse> getEarnOfThisYear() {
        List<Viewbudget> viewbudgets = viewBudgetRepository.findAllByYearOrderByYearDesc(Year.now().getValue());

        return viewbudgets.stream()
                .map(viewbudget -> {
                    return AdminMonthlyRevenueResponse.builder()
                            .Total(String.valueOf(viewbudget.getEarn()))
                            .Month(String.valueOf(viewbudget.getMonth()))
                            .Year(String.valueOf(viewbudget.getYear()))
                            .build();
                })
                .toList();
    }

    @Override
    public List<AdminFourYearPerResponse> getEarnOfFourYear() {
        int currentYear = Year.now().getValue();
        List<Viewbudget> viewbudgets = viewBudgetRepository.findAllByYearBetweenOrderByYearDesc(currentYear-3 , currentYear);


        int total = viewbudgets.stream().mapToInt(viewbudget -> Math.toIntExact(viewbudget.getTotal())).sum();


        return viewbudgets.stream()
                .map(viewbudget -> {
                    double percentage = (viewbudget.getEarn() / (double) total) * 100;
                    return new AdminFourYearPerResponse(String.valueOf(percentage), String.valueOf(viewbudget.getYear()));
                })
                .toList();
    }

    @Override
    public List<AdminImcomenProfitResponse> getMonlyIncomenProfit() {
        List<Viewbudget> viewbudgets = viewBudgetRepository.findAllByYearOrderByYearDesc(Year.now().getValue());

        return viewbudgets.stream()
                .map(viewbudget -> {
                    return AdminImcomenProfitResponse.builder()
                            .Profit(String.valueOf(viewbudget.getEarn() - viewbudget.getCost()))
                            .Income(String.valueOf(viewbudget.getEarn()))
                            .Month(String.valueOf(viewbudget.getMonth()))
                            .build();
                })
                .toList();
    }
}
