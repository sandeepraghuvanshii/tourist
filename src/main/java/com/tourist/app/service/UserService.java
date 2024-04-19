package com.tourist.app.service;

import com.tourist.app.collection.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> allUser();

    Optional<User> UserById(String _id);

    User createUser(User user);
}
