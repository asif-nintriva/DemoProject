package com.backendsessions.demoproject.service.impl;

import com.backendsessions.demoproject.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        return "Welcome!";
    }


}
