package service;

import entity.Goods;

import java.util.List;

public interface GoodsSerivce {
    int addGoods(Goods goods);

    int delGoods(Goods goods);

    int upGoods(Goods goods);

    List<Goods> querryGoods(Goods goods);

    List<Goods> querryGoodsBygoodsname(Goods goods);

    List<Goods> getGoods(Goods goods);

    Goods findById(Goods recored);

    int add(Goods goods);
}
