package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    public int addUser(User user)
    {return userService.addUser(user);}

    @RequestMapping("/delUser")
    @ResponseBody
    public int delUser(User user)
    {return userService.delUser(user);}

    @RequestMapping("/upUser")
    @ResponseBody
    public int upUserByusername(User user)
    {return userService.upUserByusername(user);}


    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUserByusername(User user)
    {return userService.queryUserByusername(user);}

    @RequestMapping("/queryUserAll")
    @ResponseBody
    public List<User> queryUserAll(User user)
    {return userService.queryUserAll(user);}



}
