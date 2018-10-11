package com.ssm.controller;

import com.ssm.po.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xlf on 2018/10/11.
 */
@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("queryUser")
    @ResponseBody
    public User queryUser(Integer id) throws Exception {
        return userService.queryById(id);
    }
}
