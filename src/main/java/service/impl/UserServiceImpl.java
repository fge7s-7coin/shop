package service.impl;

import entity.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    //添加用户
    @Override
    public int addUser(User user) {
        User record = userMapper.findUserByIdCard(user);
        if (record == null) {
            String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
            user.setId(uuid);
            user.setCreateTime(sdf.format(date));
            user.setDelFlag("0");
            return userMapper.addUser(user);
        }
        return 0;
    }

    //根据user_name删除用户
    @Override
    public int delUser(User user) {
        return userMapper.delUser(user);
    }

    //通过用户名更新用户信息
    @Override
    public int upUserByusername(User user) {
        return userMapper.upUserByusername(user);
    }

    //通过用户名查询用户信息
    @Override
    public List<User> queryUserByusername(User user) {
        return userMapper.queryUserByusername(user);
    }

    //查询所有用户信息
    @Override
    public List<User> queryUserAll(User user) {
        return userMapper.queryUserAll(user);
    }

}
