package service;

import entity.Address;
import entity.BigType;

import java.util.List;

public interface BigTypeService {
    int addBigType(BigType bigType);

    int delBigType(BigType bigType);

    int upBigType(BigType bigType);

    List<BigType> querryAllBigType(BigType bigType);


    List<BigType> findBigtype(BigType bigtype);


    BigType findById(BigType recored);

    int add(BigType bigType);
}
