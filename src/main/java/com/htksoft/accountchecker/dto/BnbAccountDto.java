package com.htksoft.accountchecker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BnbAccountDto {
    private String address;
    private String apiKey;
    private int status;
    private String message;
    private BigDecimal result;
}
