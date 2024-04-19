package com.tourist.app.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "User")
public class User {

    @Id
    private String _Id;
    private String _Username;
    private String _Fullname;
    private String _Email;

    @DBRef
    private List<Message> messageIds;
}
