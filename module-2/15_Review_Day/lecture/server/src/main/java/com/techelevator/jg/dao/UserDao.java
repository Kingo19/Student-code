package com.techelevator.jg.dao;

import com.techelevator.jg.model.RegisterUserDto;
import com.techelevator.jg.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    User getUserById(int id);

    User getUserByUsername(String username);

    User createUser(RegisterUserDto user);
}
