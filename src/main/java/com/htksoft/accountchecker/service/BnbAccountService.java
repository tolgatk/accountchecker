package com.htksoft.accountchecker.service;

import com.htksoft.accountchecker.converter.BnbAccountConverter;
import com.htksoft.accountchecker.dto.BnbAccountDto;
import com.htksoft.accountchecker.entitiy.BnbAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class BnbAccountService {
    public final RestTemplate restTemplate;
    public final BnbAccountConverter bnbAccountConverter;
    public BnbAccountDto getMyBallance(String address,String apiKey){
        BnbAccount bnbAccount = restTemplate.getForObject(
                "https://api.bscscan.com/api?module=account&action=balance&address="+address+
                "&apikey="+apiKey,BnbAccount.class
        );
        bnbAccount.setAddress(address);
        bnbAccount.setApiKey(apiKey);
        return bnbAccountConverter.convert(bnbAccount);
    }
}
