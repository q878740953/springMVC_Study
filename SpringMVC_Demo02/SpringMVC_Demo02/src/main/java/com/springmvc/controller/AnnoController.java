package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/ano")
@SessionAttributes(value = {"msg"})
public class AnnoController {
    /**
     * RequestParam可以获取前端参数键与形参名称不一样的问题
     * @param username
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name")String username){
        System.out.println(username);
        return "success";
    }
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable String id){
        System.out.println("==============");
        System.out.println(id);
        return "success";
    }
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID")String jsessionid){
        System.out.println(jsessionid);
        return "success";
    }
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        model.addAttribute("msg", "张三");
        return "success";
    }
    @RequestMapping("/testdelSessionAttributes")
    public String testdelSessionAttributes(SessionStatus status, ModelMap modelMap){
        System.out.println(modelMap.get("msg"));
        status.setComplete();
        System.out.println(modelMap.get("msg"));
        return "success";
    }
}
