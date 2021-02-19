package com.bootcamp.springboot.service;

import com.bootcamp.springboot.model.UserModel;
import com.bootcamp.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserModel findByUsername(String username){
        return  userRepository.findByUsername(username);
    }

    public Optional<UserModel> findById(UserModel user) {
        return userRepository.findById(user.getId());
    }

    public void save(UserModel user) {
        userRepository.save(user);
    }

    public UserModel update(UserModel user) {
        return userRepository.save(user);
    }

    public List<UserModel> findAll() {
        return userRepository.findAll();
    }
}
