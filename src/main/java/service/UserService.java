package service;

import entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    int addUser(User user);

    int delUser(User user);

    int upUserByusername(User user);



    List<User> queryUserByusername(User user);

    List<User> queryUserAll(User user);
}
