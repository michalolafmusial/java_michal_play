package com.isa.usersengine;

import com.isa.usersengine.dao.UsersRepositoryDaoBean;
import com.isa.usersengine.domain.User;

public class Main {
    public static void main(String[] args) {

        UsersRepositoryDaoBean usersRepositoryDaoBean = new UsersRepositoryDaoBean();
        for (User user : usersRepositoryDaoBean.getUsersList()) {
            System.out.println(user.getName());
        }
    }
}