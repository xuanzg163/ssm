package com.ssm.controller;

import com.ssm.base.BaseController;
import com.ssm.base.ParamException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther zhangxuan
 * @date 2018/10/12
 * @time 11:38
 */
@Controller
@RequestMapping("index")
public class IndexController extends BaseController {

    @RequestMapping("test01")
    public String test01(){
        //测试异常捕获
//        int i = 1/0;

        //测试自定义异常
        if (1==1){
            throw new ParamException("something is error");
        }
        return "index";
    }
}
