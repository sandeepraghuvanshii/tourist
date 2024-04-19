package com.tourist.app.controller;

import com.tourist.app.collection.User;
import com.tourist.app.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getAllUser(){
        return userService.allUser();
    }

    @GetMapping("/{_Id}")
    public Optional<User> getUserById(@PathVariable String _Id){
        return userService.UserById(_Id);
    }

    @PostMapping("/person")
   public User createUser(@RequestBody User user){
       return userService.createUser(user);
    }


}
