package service;

import entity.BigType;

import java.util.List;

public interface BigTypeService {
    int addBigType(BigType bigType);

    int delBigType(BigType bigType);

    int upBigType(BigType bigType);

    List<BigType> querryAllBigType(BigType bigType);
}
