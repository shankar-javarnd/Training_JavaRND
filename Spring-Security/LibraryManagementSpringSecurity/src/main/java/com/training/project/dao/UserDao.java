package com.training.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.project.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer>{

}
