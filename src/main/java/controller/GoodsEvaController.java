package controller;

import entity.GoodsEvaluate;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.GoodsEvaluateService;

import java.util.List;

@Controller
@RequestMapping("/goodseva")
public class GoodsEvaController {

    @Autowired
   private GoodsEvaluateService goodsEvaluateService;

    @RequestMapping("/addGoodsEvaluate")
    @ResponseBody
    public int addGoodsEvaluate(GoodsEvaluate goodsEvaluate )
    {return goodsEvaluateService.addGoodsEvaluate(goodsEvaluate);}

    @RequestMapping("/delGoodsEvaluate")
    @ResponseBody
    public int delGoodsEvaluate(GoodsEvaluate goodsEvaluate )
    {return goodsEvaluateService.delGoodsEvaluate(goodsEvaluate);}

    @RequestMapping("/upGoodsEvaluate")
    @ResponseBody
    public int upGoodsEvaluate(GoodsEvaluate goodsEvaluate )
    {return goodsEvaluateService.upGoodsEvaluate(goodsEvaluate);}


    @RequestMapping("/queryGoodsEvaluate")
    @ResponseBody
    public List<User> queryGoodsEvaluate(GoodsEvaluate goodsEvaluate )
    {return goodsEvaluateService.queryGoodsEvaluate(goodsEvaluate);}

    @RequestMapping("/queryGoodsEvaluateAll")
    @ResponseBody
    public List<User> queryGoodsEvaluateAll(GoodsEvaluate goodsEvaluate )
    {return goodsEvaluateService.queryGoodsEvaluateAll(goodsEvaluate);}



}
