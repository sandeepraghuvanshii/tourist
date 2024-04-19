package com.tourist.app.service;

import com.tourist.app.collection.User;
import com.tourist.app.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> allUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> UserById(String _Id) {
        return userRepository.findById(_Id);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

}
