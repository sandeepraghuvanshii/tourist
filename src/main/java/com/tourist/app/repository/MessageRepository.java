package com.tourist.app.repository;

import com.tourist.app.collection.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {
}
