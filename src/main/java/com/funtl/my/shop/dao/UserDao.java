package com.funtl.my.shop.dao;

import com.funtl.my.shop.entity.User;

public interface UserDao {
    public User getUser(String email, String password);
}
