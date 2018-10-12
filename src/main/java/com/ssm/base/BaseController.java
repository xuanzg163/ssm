package com.ssm.base;

import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理父类
 * @auther zhangxuan
 * @date 2018/10/12
 * @time 11:41
 */

public class BaseController {

    @ExceptionHandler
    public String exec(HttpServletRequest request,
                       HttpServletResponse response,
                       Exception ex){

        System.out.println("========================");
        System.out.println("============BaseController ...============");
        System.out.println("========================");
        request.setAttribute("ex", ex.getMessage());// 默认信息

        // 异常判断
        if(ex instanceof ParamException){
            ParamException e = (ParamException) ex;
            request.setAttribute("ex", e.getMessage());
            return "params";
        }

        return "error";//默认页面
    }
}
