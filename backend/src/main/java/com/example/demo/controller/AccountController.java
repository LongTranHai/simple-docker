package com.example.demo.controller;


import com.example.demo.data.dto.AccountDTO;
import com.example.demo.data.model.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/account")
    public ResponseEntity<Account> greet(@RequestBody AccountDTO dto)
    {
        return ResponseEntity.ok(accountService.greet(dto));
    }
}
