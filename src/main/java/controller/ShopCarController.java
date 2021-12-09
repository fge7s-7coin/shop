package controller;

import entity.ShopCar;
import entity.SmallType;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.ShopCarService;
import service.UserService;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
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


//    list
    @RequestMapping(value = "/list",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView list(ShopCar shopCar){
        ModelAndView mv = new ModelAndView();
        List<ShopCar> datalist = shopCarService.getShopCar(shopCar);
        mv.addObject("datalist",datalist);
        mv.setViewName("shopCarPage");
        return mv;

    }


//    forms
    @RequestMapping(value = "/forms",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView forms(ShopCar shopCar){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("shopCarForms");
        return mv;
    }

//    form
    @RequestMapping(value = "/form",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView form(HttpServletRequest request){
        ModelAndView mv  = new ModelAndView();
        String id = request.getParameter("id");
        ShopCar recore = new ShopCar();
        recore.setId(id);
        ShopCar  shopcarlist = shopCarService.findById(recore);
        mv.addObject("shopcarlist",shopcarlist);
        mv.setViewName("shopCarForm");
        return mv;
    }


    //    add
    @RequestMapping(value = "/add",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView add(ShopCar shopCar){
        ModelAndView mv = new ModelAndView();
        int addlist = shopCarService.add(shopCar);
        mv.addObject("addlist",addlist);
        mv.setViewName("shopCarPage");
        return mv;
    }





}
