package com.example.demo.controller;

import com.example.demo.model.user;
import com.example.demo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userController {

    @Autowired
    private userService service;

    @PostMapping
    public user addUser(@RequestBody user user) {
        return service.saveUser(user);
    }

    @GetMapping
    public List<user> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public user getUser(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
        return "User deleted";
    }
}