package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
//
    @Autowired
    private UserService userService;

//    @RequestMapping("/addUser")
//    @ResponseBody
//    public int addUser(User user)
//    {return userService.addUser(user);}


    @RequestMapping(value = "/add",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView add(User user){
        ModelAndView mv = new ModelAndView();

        int useradd = userService.add(user);
        mv.addObject("useradd", useradd);
        mv.setViewName("userPage");
        return mv;
    }

//    forms
    @RequestMapping(value = "forms",method = {RequestMethod.GET,RequestMethod.POST})
//    @ResponseBody
    public ModelAndView forms(User user){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("userForms");

        return mv;
    }





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


//    验证登陆
    @RequestMapping("/login")
    public String login(User user)
    {
        if (userService.login(user)==1)
        {

            return "head";
        }
        else {
            return "login";
        }
    }

//查询
@RequestMapping("/list")
    public ModelAndView getUser(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        List<User> userList = userService.getUser(request);
        mv.addObject("userList", userList);
        mv.setViewName("userPage");
        return mv;
    }

//    查询
    @RequestMapping("/form")

    public ModelAndView getForm(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String id = request.getParameter("id");
        User recore = new User();
        recore.setId(id);
        User user = userService.findUserById(recore);
        mv.addObject("user",user);
        mv.setViewName("userForm");
        return mv;
    }



}
