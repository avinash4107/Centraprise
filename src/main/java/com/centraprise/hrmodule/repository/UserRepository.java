package com.centraprise.hrmodule.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.centraprise.hrmodule.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	
	User findByUsername(String username);


}
