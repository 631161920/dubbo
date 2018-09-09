package com.winter.service;

import com.winter.model.User;

import java.util.List;

/**
 * @Description:
 * @Author: zhujianli
 * @CreateDate: 2018/7/30 18:01
 * @Version: 1.0
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
