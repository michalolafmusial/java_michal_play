package homework_6_1.dao;

import homework_6_1.domain.User;
import homework_6_1.repository.UsersRepository;

import javax.inject.Inject;
import java.util.List;

public class UsersRepositoryDaoBean implements UsersRepositoryDao {

    @Inject
    UsersRepository usersRepository;
    @Override
    public List<User> getUsersList() {
        return usersRepository.getRepository();
    }
}
