package com.ritian.service.impl;

import com.ritian.dao.UserMapper;
import com.ritian.entity.User;
import com.ritian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ritian
 * @Date: 2020/10/30 9:01
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper usermapper;

    @Override
    public User login(User user) {
        User user1 = usermapper.login(user);
        return user1;
    }
}
