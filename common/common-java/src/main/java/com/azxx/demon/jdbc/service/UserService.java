package com.azxx.demon.jdbc.service;

import com.azxx.demon.jdbc.dao.UserDao;
import com.azxx.demon.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void insert(User user){
        userDao.insert(user);
    }
}
