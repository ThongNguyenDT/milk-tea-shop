package com.example.web_project.services.Impl.admin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminMonthlyRevenueResponse {

    @JsonProperty("Earning")
    private String Total;
    private String Month;
    private String Year;
}
