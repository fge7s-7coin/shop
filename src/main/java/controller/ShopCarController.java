package controller;

import entity.ShopCar;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ShopCarService;
import service.UserService;

import java.util.List;

@Controller
@RequestMapping("/shopcar")
public class ShopCarController {

    @Autowired
    private ShopCarService shopCarService;

    @RequestMapping("/addShopCar")
    @ResponseBody
    public int addShopCar(ShopCar shopCar)
    {return shopCarService.addShopCar(shopCar);}

    @RequestMapping("/delShopCar")
    @ResponseBody
    public int delShopCar(ShopCar shopCar)
    {return shopCarService.delShopCar(shopCar);}

    @RequestMapping("/upShopCar")
    @ResponseBody
    public int upShopCar(ShopCar shopCar)
    {return shopCarService.upShopCar(shopCar);}


    @RequestMapping("/queryShopCar")
    @ResponseBody
    public List<User> queryShopCar(ShopCar shopCar)
    {return shopCarService.querryShopCar(shopCar);}

    @RequestMapping("/queryShopCarAll")
    @ResponseBody
    public List<User> querryShopCarAll(ShopCar shopCar)
    {return shopCarService.querryShopCarAll(shopCar);}



}
