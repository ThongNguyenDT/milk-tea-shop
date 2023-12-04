package com.example.web_project.services.Impl.admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminImcomenProfitResponse {
    private String Income;
    private String Profit;
    private String Month;
}
