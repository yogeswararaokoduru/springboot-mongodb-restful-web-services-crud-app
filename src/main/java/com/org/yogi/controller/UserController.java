package com.org.yogi.controller;

import com.org.yogi.model.User;
import com.org.yogi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yogi
 */

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping(value = "/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/user/{id}")
    public User findUser(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @PostMapping(value = "/user")
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping(value = "/user")
    public User updateUser(@RequestBody User user) {

        return userRepository.save(user);
    }

    @DeleteMapping(value = "/user/{id}")
    public Long deleteUser(@PathVariable String id) {

        return userRepository.deleteById(id);
    }

}
