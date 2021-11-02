package controller;

import entity.SmallType;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.SmallTypeService;
import service.UserService;

import java.util.List;

@Controller
@RequestMapping("/smalltype")
public class SmallTypeController {

    @Autowired
    private SmallTypeService smallTypeService;

    //    添加小类型信息
    @RequestMapping("/addSmallType")
    @ResponseBody
    public int addSmallType(SmallType smallType) {
        return smallTypeService.addSmallType(smallType);
    }

    //删除小类型信息根据type_Name
    @RequestMapping("/delSmallType")
    @ResponseBody
    public int delSmallType(SmallType smallType) {
        return smallTypeService.delSmallType(smallType);
    }
//    更新小类型信息根据type_Name

    @RequestMapping("/upSmallType")
    @ResponseBody
    public int upSmallType(SmallType smallType) {
        return smallTypeService.upSmallType(smallType);
    }

//    查询所有信息
    @RequestMapping("/querrySmallType")
    @ResponseBody
    public List<SmallType> querrySmallType(SmallType smallType){
        return smallTypeService.querrySmallType(smallType);
    }


}
