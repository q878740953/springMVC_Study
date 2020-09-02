package com.springmvc.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 */
public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        // 创建异常对象
        SysException sysException = null;
        if (e instanceof SysException){
            sysException = (SysException) e;
        }
        else {
            sysException = new SysException("系统维护中。。。。。");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("errmsg", sysException.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
