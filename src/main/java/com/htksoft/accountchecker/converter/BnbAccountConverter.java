package com.htksoft.accountchecker.converter;

import com.htksoft.accountchecker.dto.BnbAccountDto;
import com.htksoft.accountchecker.entitiy.BnbAccount;
import org.springframework.stereotype.Component;

@Component
public class BnbAccountConverter {
    public BnbAccountDto convert(BnbAccount from){
        return new BnbAccountDto(from.getAddress(),
                from.getApiKey(),
                from.getStatus(),
                from.getMessage(),
                from.getResult()
        );
    }

}
