package service.impl;

import entity.ShopCar;
import entity.User;
import mapper.ShopCarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ShopCarService;

import java.util.List;
import java.util.UUID;

@Service("shopCarService")
public class ShopCarServiceImpl implements ShopCarService {
    @Autowired
    private ShopCarMapper shopCarMapper;


    @Override
    public int addShopCar(ShopCar shopCar) {
        ShopCar recore = shopCarMapper.findShopCarIdByGoodsId(shopCar);

        if (recore == null) {
            String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            shopCar.setId(uuid);
            shopCar.setDelFlag("0");
            return shopCarMapper.addShopCar(shopCar);
        }
        return 0;
    }

    @Override
    public int delShopCar(ShopCar shopCar) {
        return shopCarMapper.delShopCar(shopCar);
    }

    @Override
    public int upShopCar(ShopCar shopCar) {
        return shopCarMapper.upShopCar(shopCar);
    }


    @Override
    public List<User> querryShopCar(ShopCar shopCar) {
        return shopCarMapper.querryShopCar(shopCar);
    }

    @Override
    public List<User> querryShopCarAll(ShopCar shopCar) {
        return shopCarMapper.querryShopCarAll(shopCar);
    }
}
