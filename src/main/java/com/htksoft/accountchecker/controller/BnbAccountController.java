package com.htksoft.accountchecker.controller;

import com.htksoft.accountchecker.dto.BnbAccountDto;
import com.htksoft.accountchecker.service.BnbAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("v1/bnb")
@RestController
@RequiredArgsConstructor
public class BnbAccountController {
    private final BnbAccountService bnbAccountService;
    @GetMapping("/getMyBallance/{addres}&{apiKey}")
    public ResponseEntity<BnbAccountDto> getMyBallance(@PathVariable String addres,
                                                       @PathVariable String apiKey){
        return ResponseEntity.ok(bnbAccountService.getMyBallance(addres,apiKey));
    }
}
