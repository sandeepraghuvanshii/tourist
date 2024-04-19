package com.tourist.app.controller;

import com.tourist.app.collection.Message;
import com.tourist.app.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public Message createMessage(@RequestBody Map<String, String> payload){
        return messageService.createMessage(payload.get("messageBody"), payload.get("_Id"));
    }
}
