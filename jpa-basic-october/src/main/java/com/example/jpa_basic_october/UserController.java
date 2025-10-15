package com.example.jpa_basic_october;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);

    }
    @GetMapping("/getUserList")
    public List<User> getUserList() {
        return userService.getUserList();
    }
}
