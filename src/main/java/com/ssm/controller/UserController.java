package com.ssm.controller;

import com.ssm.dto.UserCardDto;
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

    /**
     *  根据用户id删除指定用户
     * @param id
     * @return 影响行数
     * @throws Exception
     */
    @RequestMapping(value = "delete/{id}",method = RequestMethod.GET)
    @ResponseBody
    public int delete(@PathVariable Integer id) throws Exception{
        return userService.delete(id);
    }

    /**
     *  添加用户
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping("save")
    @ResponseBody
    public int save(User user) throws Exception{
        return userService.save(user);
    }

    /**
     * 更新用户信息
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping("update")
    @ResponseBody
    public int update(User user) throws Exception{
        return userService.update(user);
    }


    @RequestMapping("queryUserCardById/{id}")
    @ResponseBody
    public UserCardDto queryUserCardById(@PathVariable Integer id) throws Exception{
        return userService.queryUserCardById(id);
    }

}
