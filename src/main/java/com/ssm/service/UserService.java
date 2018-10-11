package com.ssm.service;

import com.ssm.base.BaseService;
import com.ssm.dao.UserMapper;
import com.ssm.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther zhangxuan
 * @date 2018/10/11
 * @time 21:14
 */
@Service
public class UserService extends BaseService<User> {
    @Autowired
    private UserMapper userMapper;
}
