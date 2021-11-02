package controller;

import entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AddressService;

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
    @RequestMapping("/delAddress")
    @ResponseBody
    public int delAddress(Address address) {
        return addressService.delAddress(address);
    }

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


}
