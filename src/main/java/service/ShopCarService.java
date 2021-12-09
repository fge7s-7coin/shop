package service;

import entity.ShopCar;
import entity.User;

import java.util.List;

public interface ShopCarService {
    int addShopCar(ShopCar shopCar);

    int delShopCar(ShopCar shopCar);

    int upShopCar(ShopCar shopCar);



    List<User> querryShopCar(ShopCar shopCar);

    List<User> querryShopCarAll(ShopCar shopCar);

    List<ShopCar> getShopCar(ShopCar shopCar);

   
    int add(ShopCar shopCar);

    ShopCar findById(ShopCar recore);
}
