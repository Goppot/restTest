package com.example.rest.service;

import com.example.rest.model.User;
import com.example.rest.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> getAll(){
        Iterable<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public User getByUSerId(int id) {
        return userRepository.findById(id).orElse(new User());
    }


}
