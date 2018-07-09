package com.isa.usersengine.dao;

import com.isa.usersengine.domain.User;
import com.isa.usersengine.repository.UsersRepository;

import java.util.List;

public class UsersRepositoryDaoBean implements UsersRepositoryDao {
    @Override
    public void addUser(User user) {

    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User getUserByLogin(String login) {
        return null;
    }

    @Override
    public List<User> getUsersList() {
        return UsersRepository.getRepository();
    }
}