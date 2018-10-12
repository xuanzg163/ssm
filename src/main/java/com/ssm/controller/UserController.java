package com.ssm.controller;

import com.ssm.po.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xlf on 2018/10/11.
 */
@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;

    /**
     *  根据用户id查询用户信息
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "queryUser/{id}/{name}",method = RequestMethod.GET)
    @ResponseBody
    public User queryUser(@PathVariable Integer id, @PathVariable String name) throws Exception {
        return userService.queryById(id);
    }
}
