package com.example.controller;

import com.example.entity.User;
import com.example.repository.UserResitory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by root on 17-2-15.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserResitory userResitory;

    @RequestMapping(value = "/findAll")
    @ResponseBody
    public List findAll() {
        List<User> userList = userResitory.findAll();
        return userList;
    }

}
