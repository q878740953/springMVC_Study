package com.ssm.dao;

import com.ssm.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {
    // 查询所有账户
    @Select("select * from account")
    List<Account> findAllAccount();
    // 保存账户
    @Insert("insert into account(uid, money) values(#{uid}, #{money})")
    void saveAccount(Account account);
}
