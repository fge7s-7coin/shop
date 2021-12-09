package controller;

import entity.SmallType;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.SmallTypeService;
import service.UserService;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
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

//    list
    @RequestMapping(value = "/list",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView list(SmallType smallType){
        ModelAndView mv = new ModelAndView();
//        SmallType smallType1 = new SmallType();
        List<SmallType> smallTypeList = smallTypeService.getSmallType(smallType);
        mv.addObject("smallTypeList",smallTypeList);
        mv.setViewName("smallTypePage");
        return mv;
    }


//    forms
    @RequestMapping(value = "/forms",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView forms(SmallType smallType){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("smallTypeForms");
        return mv;
    }

    //    form
    @RequestMapping(value = "/form",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView form(HttpServletRequest request){

        ModelAndView mv = new ModelAndView();
        String id = request.getParameter("id");
        SmallType recored = new SmallType();
        recored.setId(id);
        SmallType smallTypelist = smallTypeService.findById(recored);
        mv.addObject("smallTypelist",smallTypelist);
        mv.setViewName("smallTypeForm");
        return mv;
    }

//    add
    @RequestMapping(value = "/add",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView add(SmallType smallType){
        ModelAndView mv = new ModelAndView();
        int smalltypeaddlist = smallTypeService.add(smallType);
        mv.addObject("smalltypeaddlist",smalltypeaddlist);
        mv.setViewName("smallTypePage");
        return mv;
    }


}
