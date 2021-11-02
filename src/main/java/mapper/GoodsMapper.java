package mapper;

import entity.Goods;
import entity.User;

import java.util.List;


public interface GoodsMapper {


    int addGoods(Goods goods);

    Goods findGoodsByIdCard(Goods goods);

    int delGoods(Goods goods);

    int upGoods(Goods goods);

    List<Goods> querryGoods(Goods goods);

    List<Goods> querryGoodsBygoodsname(Goods goods);
}
