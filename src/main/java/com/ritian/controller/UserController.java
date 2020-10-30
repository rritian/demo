package com.ritian.controller;

import com.ritian.entity.User;
import com.ritian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ritian
 * @Date: 2020/10/29 15:01
 */
@Controller
public class UserController {
    @Autowired
    private UserService userservice;
    @RequestMapping("login")
    public String login(@RequestParam("id") Integer id, @RequestParam("pwd") String pwd) {
        User user = new User();
        user.setId(id);
        user.setPwd(pwd);
        if(userservice.login(user) != null) {
            return "success";
        }else {
            return "fail";
        }

    }

}
