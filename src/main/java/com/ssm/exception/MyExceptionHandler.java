package com.ssm.exception;

import com.ssm.po.User;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @auther zhangxuan
 * @date 2018/10/12
 * @time 14:20
 */

public class MyExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object handler, Exception ex) {
        //2、区分什么类型的错误
        System.out.println("MyExceptionHandler is running");

        //1、创建一个新的ModeAndView对象
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");//默认的错误页面
        mv.addObject("ex", ex.getMessage());

        /**
         * 判断实例是某个类的实例对象（instanceof）
         */
        if (ex instanceof ParamException) {
            ParamException e = (ParamException) ex;
            mv.setViewName("params");//自定义错误页面
            mv.addObject("ex", ex.getMessage());

        }
        return mv;
    }


    /**
     *  测试instanceof
     * @param args
     */
    public static void main(String[] args){
        User user = new User();
        String str = "hello";
        System.out.println(user instanceof User);
    }
}
