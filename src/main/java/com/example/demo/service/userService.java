package com.example.demo.service;

import com.example.demo.model.user;
import com.example.demo.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    @Autowired
    private userRepository repository;

    public user saveUser(user user) {
        return repository.save(user);
    }

    public List<user> getAllUsers() {
        return repository.findAll();
    }

    public user getUserById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}