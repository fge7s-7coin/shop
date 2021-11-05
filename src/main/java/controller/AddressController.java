package controller;

import entity.Address;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.AddressService;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    //    添加收货人信息
    @RequestMapping("/addAddress")
    @ResponseBody
    public int addAddress(Address address) {
        return addressService.addAddress(address);
    }

    //删除收货人信息
//    @RequestMapping("/delAddress")
//    @ResponseBody
//    public int delAddress(Address address) {
//        return addressService.delAddress(address);
//    }

//更新收货人信息

    @RequestMapping("/upAddress")
    @ResponseBody
    public int upAddress(Address address) {
        return addressService.upAddress(address);
    }

    //查询所有收货人信息
    @RequestMapping("/querryAddress")
    @ResponseBody
    public List<Address> querryAddress(Address address) {
        return addressService.querryAddress(address);
    }

    //通过收货人姓名查询收货人信息
    @RequestMapping("/querryAddressByconsignee")
    @ResponseBody
    public List<Address> querryAddressByconsignee(Address address) {
        return addressService.querryAddressByconsignee(address);
    }

//    @RequestMapping("/list")
//    public ModelAndView getUser(HttpServletRequest request){
//        ModelAndView mv = new ModelAndView();
//        List<User> userList = userService.getUser(request);
//        mv.addObject("userList", userList);
//        mv.setViewName("userPage");
//        return mv;
//    }

    @RequestMapping(value = "/list",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView getAddress(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        List<Address>  addressList = addressService.getAddress(request);
        mv.addObject("addressList",addressList);
        mv.setViewName("addressPage");
        return mv;
    }

    @RequestMapping(value = "/form",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView form(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String id = request.getParameter("id");
        Address recored = new Address();
        recored.setId(id);
        Address address = addressService.findById(recored);
        mv.addObject("address",address);
        mv.setViewName("addressForm");
        return mv;

    }


//    forms
    @RequestMapping(value = "forms",method = {RequestMethod.GET,RequestMethod.POST})
    //    @ResponseBody
    public ModelAndView forms(Address address){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("userForms");

        return mv;
    }


    //    add
    @RequestMapping(value = "/add",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView add(Address address){
        ModelAndView mv = new ModelAndView();

        int addressadd = addressService.add(address);
        mv.addObject("addressadd", addressadd);
        mv.setViewName("addresPage");
        return mv;
    }


    @RequestMapping(value = "/delAddress",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public int delAddress(Address address){


         return addressService.delAddress(address);


    }


}
