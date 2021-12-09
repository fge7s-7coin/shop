package service;

import entity.Ord;
import entity.User;

import java.util.List;

public interface OrdService {
    int addOrd(Ord ord);

    int delOrd(Ord ord);

    int upOrd(Ord ord);

    List<User> queryOrd(Ord ord);

    List<User> queryOrdAll(Ord ord);

    List<Ord> getOrd(Ord ord);

    Ord findById(Ord recore);

    int add(Ord ord);
}
