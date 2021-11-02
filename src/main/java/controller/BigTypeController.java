package controller;

import entity.BigType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.BigTypeService;

import java.util.List;

@Controller
@RequestMapping("/bigtype")
public class BigTypeController {

    @Autowired
    private BigTypeService bigTypeService;

//    添加商品大分类表
    @RequestMapping("/addBigType")
    @ResponseBody
    public int addBigType(BigType bigType)
    {return bigTypeService.addBigType(bigType);}

//    删除

    @RequestMapping("/delBigType")
    @ResponseBody
    public int delBigType(BigType bigType)
    {return bigTypeService.delBigType(bigType);}
//    修改

    @RequestMapping("/upBigType")
    @ResponseBody
    public int upBigType(BigType bigType)
    {return bigTypeService.upBigType(bigType);}

//    查询
    @RequestMapping("/querryAllBigType")
    @ResponseBody
    public List<BigType> querryAllBigType(BigType bigType)
    {return bigTypeService.querryAllBigType(bigType);}



}
