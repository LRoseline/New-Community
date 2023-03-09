package com.tfriends.root.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tfriends.dto.AccountDTO;
import com.tfriends.service.AccountService;

@RequestMapping("/api/*")
@RestController
public class AccountController {
    @Autowired
    private AccountService service;

    @PostMapping("/userlogin")
    public AccountDTO getLoginInfo(@RequestHeader("Account-id") String id) {
        AccountDTO dto = service.logOn(id);

        return dto;
    }
}
