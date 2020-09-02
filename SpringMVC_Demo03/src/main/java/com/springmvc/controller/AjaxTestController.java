package com.springmvc.controller;

import com.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/test")
public class AjaxTestController {
    @RequestMapping("/ajax")
    @ResponseBody
    public void testAjax(@RequestBody String body){
        System.out.println("=====================");
        System.out.println(body);
    }
    @RequestMapping("/t01")
    public @ResponseBody List<User> testUser(){
        User user1 = new User("航三", 19, new Date());
        User user2 = new User("李四", 19, new Date());
        User user3 = new User("王五", 19, new Date());
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return userList;
    }
}
