package com.example.exampleMangodb.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collation = "users")
public class Users {
    @Id
    private String id;
    private String name;
    private String address;
}
