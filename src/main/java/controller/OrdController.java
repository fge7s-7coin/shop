package controller;

import com.sun.tools.corba.se.idl.constExpr.Or;
import entity.Goods;
import entity.GoodsEvaluate;
import entity.Ord;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.OrdService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/ord")
public class OrdController {

    @Autowired
    private OrdService ordService;

    @RequestMapping("/addOrd")
    @ResponseBody
    public int addOrd(Ord ord) {
        return ordService.addOrd(ord);
    }

    @RequestMapping("/delOrd")
    @ResponseBody
    public int delOrd(Ord ord) {
        return ordService.delOrd(ord);
    }

    @RequestMapping("/upOrd")
    @ResponseBody
    public int upOrd(Ord ord) {
        return ordService.upOrd(ord);
    }


    @RequestMapping("/queryOrd")
    @ResponseBody
    public List<User> queryOrd(Ord ord) {
        return ordService.queryOrd(ord);
    }

    @RequestMapping("/queryOrdAll")
    @ResponseBody
    public List<User> queryOrdAll(Ord ord) {
        return ordService.queryOrdAll(ord);
    }


    //    list
    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView list(Ord ord) {
        ModelAndView mv = new ModelAndView();
        List<Ord> ordlist = ordService.getOrd(ord);
        mv.addObject("ordlist", ordlist);
        mv.setViewName("ordPage");
        return mv;

    }

    //forms
    @RequestMapping(value = "/forms", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView forms(Ord ord) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("ordForms");
        return mv;
    }


    //    form
    @RequestMapping(value = "/form",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView form(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String id = request.getParameter("id");
        Ord recore = new Ord();
        recore.setId(id);
        Ord  ordlist = ordService.findById(recore);
        mv.addObject("ordlist",ordlist);
        mv.setViewName("ordForm");
        return mv;

    }

    //    add
    @RequestMapping(value = "/add",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView add(Ord ord){
        ModelAndView mv = new ModelAndView();
        int ordaddlist = ordService.add(ord);
        mv.addObject("ordaddlist", ordaddlist);
        mv.setViewName("ordPage");
        return mv;
    }

}
