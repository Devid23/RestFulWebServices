package com.devidkarki.rest.webservices.restfulwebservices.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devidkarki.rest.webservices.restfulwebservices.model.User;

//inherits the pre-defined method for basic CRUD operations on the User entity
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
