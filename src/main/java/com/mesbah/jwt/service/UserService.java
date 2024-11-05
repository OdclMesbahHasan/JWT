package com.mesbah.jwt.service;

import com.mesbah.jwt.dao.UserDao;
import com.mesbah.jwt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
        return userDao.save(user);
    }
}
