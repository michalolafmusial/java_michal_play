package homework_6_1.repository;

import homework_6_1.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    private List<User> userList = new ArrayList<>();

    public List<User> getRepository () {
        return userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
