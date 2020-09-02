package com.ssm.service;

import com.ssm.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAllAccount();
    void saveAccount(Account account);
}
