package com.ssm.dao;

import com.ssm.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface AccountDao {
    @Select("select * from account")
    List<Account> findAllAccount();
    @Insert("insert into account (uid, money) values(#{uid}, #{money})")
    void saveAccount(Account account);
}
