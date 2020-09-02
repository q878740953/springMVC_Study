package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping(path = "/paramTest01", method = RequestMethod.POST)
    public String paramTest01(String username, String password, Model model){
        System.out.println(username);
        System.out.println(password);
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        return "success";
    }
}
