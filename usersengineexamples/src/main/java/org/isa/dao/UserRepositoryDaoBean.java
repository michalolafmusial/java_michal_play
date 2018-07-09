package org.isa.dao;

import org.isa.interceptors.HelloInterceptor;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;

@Stateless
@Local(UserRepositoryDao.class)
@WebService(name = "myendpoint")
public class UserRepositoryDaoBean implements UserRepositoryDaoRemote {
    @Override
    public String sayHello() {
        return "My name is Michal";
    }

    @Override
    @Interceptors(HelloInterceptor.class)
    public String sayHelloName(String name) {




        return "My name is "+name;
    }
}
