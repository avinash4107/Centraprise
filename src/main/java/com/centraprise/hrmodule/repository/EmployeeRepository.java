package com.centraprise.hrmodule.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.centraprise.hrmodule.model.EmployeeDetails;

public interface EmployeeRepository extends MongoRepository<EmployeeDetails, String> {

}
