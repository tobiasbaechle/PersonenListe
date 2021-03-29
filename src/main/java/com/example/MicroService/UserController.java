package com.example.MicroService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.*;

import java.net.Socket;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(path="user/")
public class UserController {

    private static final String URL = "http://localhost:8080/user/";

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping()
    @RequestMapping(path= "all")
    public List<User> getAllUsers(){

        return this.userService.getUsers();
    }

    @PostMapping()
    @RequestMapping(path= "new")
    public User createUser(@RequestBody CreateRequest request){

        User user = new User();
        user.setName(request.name);
        this.userService.addUser(user);

        return user;
    }


    public static class CreateRequest {
        public String name="";
    }
}
