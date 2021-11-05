package mapper;

import entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public interface UserMapper {

    User findUserByIdCard(User user);

    int addUser(User user);

    int delUser(User user);


    int upUserByusername(User user);

    List<User> queryUserByusername(User user);

    List<User> queryUserAll(User user);

    int login(User user);

    List<User> getUser(User user);


    User findUserById(User recore);
}
