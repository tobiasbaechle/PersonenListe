package com.example.MicroService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    private static final List<User> USERS = new ArrayList<>();

    public void addUser(User user){
        USERS.add(user);
    }

    public List<User> getUsers() {
        return USERS;
    }
}
