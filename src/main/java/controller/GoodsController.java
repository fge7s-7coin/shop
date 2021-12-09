package controller;

import entity.Address;
import entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.GoodsSerivce;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsSerivce goodsSerivce;

    @RequestMapping("/addGoods")
    @ResponseBody
    public int addGoods(Goods goods) {
        return goodsSerivce.addGoods(goods);
    }


    @RequestMapping("/delGoods")
    @ResponseBody
    public int delGoods(Goods goods) {
        return goodsSerivce.delGoods(goods);
    }


    @RequestMapping("/upGoods")
    @ResponseBody
    public int upGoods(Goods goods) {
        return goodsSerivce.upGoods(goods);
    }

    //查询所有信息
    @RequestMapping("/querryGoods")
    @ResponseBody
    public List<Goods> querryGoods(Goods goods) {
        return goodsSerivce.querryGoods(goods);
    }

    //    通过商品名查询所有商品信息
    @RequestMapping("/querryGoodsBygoodsname")
    @ResponseBody
    public List<Goods> querryGoodsBygoodsname(Goods goods) {
        return goodsSerivce.querryGoodsBygoodsname(goods);
    }


    //    list
    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView list(Goods goods) {
        ModelAndView mv = new ModelAndView();
        List<Goods> goodslist = goodsSerivce.getGoods(goods);
        mv.addObject("goodslist", goodslist);
        mv.setViewName("goodsPage");
        return mv;
    }

    @RequestMapping(value = "/form", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView form(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        String id = request.getParameter("id");
        Goods recored = new Goods();
        recored.setId(id);
        Goods goodsformlist = goodsSerivce.findById(recored);
        mv.addObject("goodsformlist", goodsformlist);
        mv.setViewName("goodsForm");
        return mv;

    }


    //    forms
    @RequestMapping(value = "forms", method = {RequestMethod.GET, RequestMethod.POST})
    //    @ResponseBody
    public ModelAndView forms(Goods Goods) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("goodsForms");
        return mv;
    }


    //    add
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView add(Goods Goods) {
        ModelAndView mv = new ModelAndView();

        int goodsadd = goodsSerivce.add(Goods);
        mv.addObject("goodsadd", goodsadd);
        mv.setViewName("goodsPage");
        return mv;
    }


}
