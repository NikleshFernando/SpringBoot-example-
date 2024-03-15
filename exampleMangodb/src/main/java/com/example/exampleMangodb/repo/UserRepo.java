package com.example.exampleMangodb.repo;

import com.example.exampleMangodb.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<Users,String> {
}
