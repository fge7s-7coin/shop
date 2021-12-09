package mapper;

import entity.ShopCar;
import entity.User;

import java.util.List;


public interface ShopCarMapper {


    int addShopCar(ShopCar shopCar);

    int delShopCar(ShopCar shopCar);

    int upShopCar(ShopCar shopCar);

    List<User> querryShopCar(ShopCar shopCar);

    List<User> querryShopCarAll(ShopCar shopCar);

    ShopCar findShopCarIdByGoodsId(ShopCar shopCar);

    List<ShopCar> getShopCar(ShopCar shopCar);


    ShopCar findById(ShopCar recore);
}
