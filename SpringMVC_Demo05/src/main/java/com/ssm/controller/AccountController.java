package com.ssm.controller;

import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountController {
    @RequestMapping("/test01")
    public String test01(Model model){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        // 查询所有用户
        List<Account> accounts = accountService.findAllAccount();
        model.addAttribute("accounts", accounts);
        return "success";
    }
    @RequestMapping("/save")
    public String save(Account account){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.saveAccount(account);
        return "redirect:/test01";
    }
}
