package controller;

import entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.GoodsSerivce;

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




}
