package service.impl;

import entity.Goods;
import mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.GoodsSerivce;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class GoodsServiceImpl implements GoodsSerivce {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public int addGoods(Goods goods) {
        Goods recore = goodsMapper.findGoodsByIdCard(goods);
        if (recore == null) {

            String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
            goods.setId(uuid);
            goods.setCreateTime(sdf.format(date));
            goods.setDelFlag("0");
            return goodsMapper.addGoods(goods);
        }
        return 0;

    }

    @Override
    public int delGoods(Goods goods) {
        return goodsMapper.delGoods(goods);
    }

    @Override
    public int upGoods(Goods goods) {
        return goodsMapper.upGoods(goods);
    }

    @Override
    public List<Goods> querryGoods(Goods goods) {
        return goodsMapper.querryGoods(goods);
    }

    @Override
    public List<Goods> querryGoodsBygoodsname(Goods goods) {
        return goodsMapper.querryGoodsBygoodsname(goods);
    }


}
