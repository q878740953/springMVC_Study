package com.ssm.service;

import com.ssm.domain.Account;

import java.util.List;

public interface AccountService {
    // 查询所有账户
    List<Account> findAllAccount();
    // 保存账户
    void saveAccount(Account account);
}
