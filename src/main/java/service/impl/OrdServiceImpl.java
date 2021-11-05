package service.impl;

import entity.Goods;
import entity.Ord;
import entity.User;
import mapper.GoodsMapper;
import mapper.OrdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrdService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("ordService")
public class OrdServiceImpl implements OrdService {
    @Autowired
    private OrdMapper ordMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public int addOrd(Ord ord) {

        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        ord.setId(uuid);
        ord.setCreateTime(sdf.format(date));
        ord.setDelFlag("0");
        int a = ordMapper.addOrd(ord);
        if (a>0) {
            Goods goods = new Goods();
            goods.setId(ord.getGoodsId());
            Goods record = goodsMapper.findGoodsByIdCard(goods);
            int num = Integer.valueOf(record.getNum()) - Integer.valueOf(ord.getNum());
            goods.setNum(num + "");
            a += goodsMapper.upGoods(goods);
        }
        return a;
    }

    @Override
    public int delOrd(Ord ord) {
        return ordMapper.delOrd(ord);
    }

    @Override
    public int upOrd(Ord ord) {
        return ordMapper.upOrd(ord);
    }

    @Override
    public List<User> queryOrd(Ord ord) {
        return ordMapper.queryOrd(ord);
    }

    @Override
    public List<User> queryOrdAll(Ord ord) {
        return ordMapper.queryOrdAll(ord);
    }
}
