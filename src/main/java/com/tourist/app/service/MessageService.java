package com.tourist.app.service;

import com.tourist.app.collection.Message;
import com.tourist.app.collection.User;
import com.tourist.app.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Message createMessage(String messageBody, String _Id){
        Message message = messageRepository.insert(new Message(messageBody));
        mongoTemplate.update(User.class)
                        .matching(Criteria.where("_Id").is(_Id))
                        .apply(new Update().push("messageIds").value(message))
                .first();
        return message;
    }
}
