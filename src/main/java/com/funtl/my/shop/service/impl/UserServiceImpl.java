package com.funtl.my.shop.service.impl;

import com.funtl.my.shop.commons.context.SpringContext;
import com.funtl.my.shop.dao.UserDao;
import com.funtl.my.shop.entity.User;
import com.funtl.my.shop.service.UserService;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    private UserDao userDao = SpringContext.getBean("userDao");

    public User login(String email, String password) {
        return userDao.getUser(email, password);
    }
}
