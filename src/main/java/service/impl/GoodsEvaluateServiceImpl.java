package service.impl;

//import entity.goodsEvaluate;
import entity.GoodsEvaluate;
import entity.User;
import mapper.GoodsEvaluateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GoodsEvaluateService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("goodsEvaluateService")
public class GoodsEvaluateServiceImpl implements GoodsEvaluateService {
    @Autowired
    private GoodsEvaluateMapper goodsEvaluateMapper;


    @Override
    public int addGoodsEvaluate(GoodsEvaluate goodsEvaluate) {
        GoodsEvaluate recore = goodsEvaluateMapper.findGoodsEvaluateByIdCard(goodsEvaluate);
        if (recore==null)
        {
            String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            goodsEvaluate.setId(uuid);
            return goodsEvaluateMapper.addGoodsEvaluate(goodsEvaluate);
        }
        return 0;
    }

    @Override
    public int delGoodsEvaluate(GoodsEvaluate goodsEvaluate) {
        return goodsEvaluateMapper.delGoodsEvaluate(goodsEvaluate);
    }

    @Override
    public int upGoodsEvaluate(GoodsEvaluate goodsEvaluate) {
        return goodsEvaluateMapper.upGoodsEvaluate(goodsEvaluate);
    }

    @Override
    public List<User> queryGoodsEvaluate(GoodsEvaluate goodsEvaluate) {
        return goodsEvaluateMapper.queryGoodsEvaluate(goodsEvaluate);
    }

    @Override
    public List<User> queryGoodsEvaluateAll(GoodsEvaluate goodsEvaluate) {
        return goodsEvaluateMapper.queryGoodsEvaluateAll(goodsEvaluate);
    }

    @Override
    public List<GoodsEvaluate> getGoodsEvaluate(GoodsEvaluate goodsEvaluate) {
        return goodsEvaluateMapper.getGoodsEvaluate(goodsEvaluate);
    }

    @Override
    public GoodsEvaluate findById(GoodsEvaluate recore) {
        return goodsEvaluateMapper.findById(recore);
    }

    @Override
    public int add(GoodsEvaluate goodsEvaluate) {
        if (goodsEvaluate.getId()==null || goodsEvaluate.getId()==""){
            GoodsEvaluate recore = goodsEvaluateMapper.findGoodsEvaluateByIdCard(goodsEvaluate);
            if (recore == null)
            {
                String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
                goodsEvaluate.setId(uuid);
                return goodsEvaluateMapper.addGoodsEvaluate(goodsEvaluate);
            }
        }else {
            return goodsEvaluateMapper.upGoodsEvaluate(goodsEvaluate);
        }
        return 0;
    }
}
