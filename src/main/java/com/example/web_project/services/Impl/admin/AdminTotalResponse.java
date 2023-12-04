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
public class AdminTotalResponse {
    @JsonProperty("Earning")
    private String Earn;
    private String Customers;
    private String Products;

}
