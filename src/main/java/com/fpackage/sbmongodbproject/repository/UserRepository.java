package com.fpackage.sbmongodbproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fpackage.sbmongodbproject.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
