package controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import entity.Address;
import entity.BigType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.BigTypeService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/bigtype")
public class BigTypeController {

    @Autowired
    private BigTypeService bigTypeService;

    //    添加商品大分类表
    @RequestMapping("/addBigType")
    @ResponseBody
    public int addBigType(BigType bigType) {
        return bigTypeService.addBigType(bigType);
    }

//    删除

    @RequestMapping("/delBigType")
    @ResponseBody
    public int delBigType(BigType bigType) {
        return bigTypeService.delBigType(bigType);
    }
//    修改

    @RequestMapping("/upBigType")
    @ResponseBody
    public int upBigType(BigType bigType) {
        return bigTypeService.upBigType(bigType);
    }

    //    查询
    @RequestMapping("/querryAllBigType")
    @ResponseBody
    public List<BigType> querryAllBigType(BigType bigType) {
        return bigTypeService.querryAllBigType(bigType);
    }

    //    查询
    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView list(BigType bigtype) {
        ModelAndView mv = new ModelAndView();
        List<BigType> bigTypelist = bigTypeService.findBigtype(bigtype);
        mv.addObject("bigTypelist", bigTypelist);
        mv.setViewName("bigTypePage");
        return mv;
    }

    //    添加
    @RequestMapping(value = "/forms", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView forms(BigType bigType) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("bigTypeForms");
        return mv;
    }

    //    编辑
    @RequestMapping(value = "/form", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView form(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        String id = request.getParameter("id");
        BigType recored = new BigType();
        recored.setId(id);
        BigType bigtype = bigTypeService.findById(recored);
        mv.addObject("bigtype", bigtype);
        mv.setViewName("bigtypeForm");
        return mv;

    }

    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView add(BigType bigType) {
        ModelAndView mv = new ModelAndView();
        int bigtypeaddlist = bigTypeService.add(bigType);
        mv.addObject("bigtypeaddlist",bigtypeaddlist);
        mv.setViewName("bigTypePage");
        return mv;

    }
}
