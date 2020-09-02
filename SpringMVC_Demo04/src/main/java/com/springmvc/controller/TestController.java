package com.springmvc.controller;

import com.springmvc.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test01")
    public String test01() throws SysException {
        try {
            // 模拟异常
            int i = 1/0;
        } catch (Exception e) {
            // 打印异常信息
            e.printStackTrace();
            // 抛出自定义异常信息
            throw new SysException("查询错误");
        }
        return "success";
    }
}
