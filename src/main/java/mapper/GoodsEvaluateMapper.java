package mapper;

import entity.GoodsEvaluate;
import entity.User;

import java.util.List;

public interface GoodsEvaluateMapper {

    int addGoodsEvaluate(GoodsEvaluate goodsEvaluate);

    int delGoodsEvaluate(GoodsEvaluate goodsEvaluate);

    int upGoodsEvaluate(GoodsEvaluate goodsEvaluate);

    List<User> queryGoodsEvaluate(GoodsEvaluate goodsEvaluate);

    List<User> queryGoodsEvaluateAll(GoodsEvaluate goodsEvaluate);

    GoodsEvaluate findGoodsEvaluateByIdCard(GoodsEvaluate goodsEvaluate);

    List<GoodsEvaluate> getGoodsEvaluate(GoodsEvaluate goodsEvaluate);

    GoodsEvaluate findById(GoodsEvaluate recore);

}
