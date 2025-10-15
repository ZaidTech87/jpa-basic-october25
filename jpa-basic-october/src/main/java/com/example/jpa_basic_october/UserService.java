package com.example.jpa_basic_october;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String addUser(User user) {
        userRepository.save(user);
        return "User added successfully!";
    }

    public List<User> getUserList() {
        return userRepository.findAll();
    }
}
