package service.impl;

import entity.GoodsEvaluate;
import entity.User;
import mapper.GoodsEvaluateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GoodsEvaluateService;

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
}
