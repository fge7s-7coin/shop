package mapper;

import entity.Goods;
import entity.Ord;
import entity.User;

import java.util.List;

public interface OrdMapper {

    int addOrd(Ord ord);

    int delOrd(Ord ord);

    int upOrd(Ord ord);

    List<User> queryOrd(Ord ord);

    List<User> queryOrdAll(Ord ord);

    Goods findOrdByIdCard(Ord ord);
}
