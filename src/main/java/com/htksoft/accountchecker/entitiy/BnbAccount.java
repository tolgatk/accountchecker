package com.htksoft.accountchecker.entitiy;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BnbAccount {

    private String address;
    private String apiKey;
    private int status;
    private String message;
    private BigDecimal result;

}
