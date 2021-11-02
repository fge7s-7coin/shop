package mapper;

import entity.User;

import java.util.List;


public interface UserMapper {

    User findUserByIdCard(User user);

    int addUser(User user);

    int delUser(User user);


    int upUserByusername(User user);

    List<User> queryUserByusername(User user);

    List<User> queryUserAll(User user);
}
