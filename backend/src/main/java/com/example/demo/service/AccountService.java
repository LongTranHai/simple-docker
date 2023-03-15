package com.example.demo.service;

import com.example.demo.data.dto.AccountDTO;
import com.example.demo.data.model.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account greet(AccountDTO accountDTO)
    {
        Account account = accountRepository.getAccountByAccount(accountDTO.getAccount());

        return Objects.isNull(account)?null:account;
    }
}
