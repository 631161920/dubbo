package com.winter.controller;

import com.winter.service.UserService;
import com.winter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zhujianli
 * @CreateDate: 2018/7/30 17:59
 * @Version: 1.0
 */
    @RestController
    @RequestMapping(value = "/user")
    public class UserController {

        @Autowired
        private UserService userService;

    /**
     * 跳转至首页
     * @return
     */
    @RequestMapping(value = "/index")
        public String index(){
           return "index";
        }
        @ResponseBody
        @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
        public int addUser(User user){
            return userService.addUser(user);
        }

        @ResponseBody
        @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
        public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

            return userService.findAllUser(pageNum,pageSize);
        }
    }

