package controller;

import com.sun.tools.corba.se.idl.constExpr.Or;
import entity.Ord;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.OrdService;

import java.util.List;

@Controller
@RequestMapping("/ord")
public class OrdController {

    @Autowired
    private OrdService ordService;

    @RequestMapping("/addOrd")
    @ResponseBody
    public int addOrd(Ord ord)
    {return ordService.addOrd(ord);}

    @RequestMapping("/delOrd")
    @ResponseBody
    public int delOrd(Ord ord)
    {return ordService.delOrd(ord);}

    @RequestMapping("/upOrd")
    @ResponseBody
    public int upOrd(Ord ord)
    {return ordService.upOrd(ord);}


    @RequestMapping("/queryOrd")
    @ResponseBody
    public List<User> queryOrd(Ord ord)
    {return ordService.queryOrd(ord);}

    @RequestMapping("/queryOrdAll")
    @ResponseBody
    public List<User> queryOrdAll(Ord ord)
    {return ordService.queryOrdAll(ord);}



}
