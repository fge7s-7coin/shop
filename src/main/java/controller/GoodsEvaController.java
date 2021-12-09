package controller;

import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.GoodsEvaluateService;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.security.PublicKey;
import java.util.List;

@Controller
@RequestMapping("/goodseva")
public class GoodsEvaController {

    @Autowired
    private GoodsEvaluateService goodsEvaluateService;

    @RequestMapping("/addGoodsEvaluate")
    @ResponseBody
    public int addGoodsEvaluate(GoodsEvaluate goodsEvaluate) {
        return goodsEvaluateService.addGoodsEvaluate(goodsEvaluate);
    }

    @RequestMapping("/delGoodsEvaluate")
    @ResponseBody
    public int delGoodsEvaluate(GoodsEvaluate goodsEvaluate) {
        return goodsEvaluateService.delGoodsEvaluate(goodsEvaluate);
    }

    @RequestMapping("/upGoodsEvaluate")
    @ResponseBody
    public int upGoodsEvaluate(GoodsEvaluate goodsEvaluate) {
        return goodsEvaluateService.upGoodsEvaluate(goodsEvaluate);
    }


    @RequestMapping("/queryGoodsEvaluate")
    @ResponseBody
    public List<User> queryGoodsEvaluate(GoodsEvaluate goodsEvaluate) {
        return goodsEvaluateService.queryGoodsEvaluate(goodsEvaluate);
    }

    @RequestMapping("/queryGoodsEvaluateAll")
    @ResponseBody
    public List<User> queryGoodsEvaluateAll(GoodsEvaluate goodsEvaluate) {
        return goodsEvaluateService.queryGoodsEvaluateAll(goodsEvaluate);
    }


    // list
    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView list(GoodsEvaluate goodsEvaluate) {
        ModelAndView mv = new ModelAndView();
        List<GoodsEvaluate> datalist = goodsEvaluateService.getGoodsEvaluate(goodsEvaluate);
        mv.addObject("datalist",datalist);
        mv.setViewName("goodsEvaPage");
        return mv;
    }

//    forms
    @RequestMapping(value = "/forms",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView forms(GoodsEvaluate goodsEvaluate){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("goodsEvaForms");
        return mv;
    }

//    form
    @RequestMapping(value = "/form",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView form(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String id = request.getParameter("id");
        GoodsEvaluate recore = new GoodsEvaluate();
        recore.setId(id);
        GoodsEvaluate  goodsEvaluatelist = goodsEvaluateService.findById(recore);
        mv.addObject("goodsEvaluatelist",goodsEvaluatelist);
        mv.setViewName("goodsEvaForm");
        return mv;

    }

//    add
@RequestMapping(value = "/add",method = {RequestMethod.GET,RequestMethod.POST})
public ModelAndView add(GoodsEvaluate goodsEvaluate){
    ModelAndView mv = new ModelAndView();

    int goodsevalist = goodsEvaluateService.add(goodsEvaluate);
    mv.addObject("goodsevalist", goodsevalist);
    mv.setViewName("goodsEvaPage");
    return mv;
}

}
