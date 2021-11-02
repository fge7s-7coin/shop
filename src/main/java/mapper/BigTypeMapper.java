package mapper;

import entity.BigType;

import java.util.List;

public interface BigTypeMapper {

    int addBigType(BigType bigType);

    int delBigType(BigType bigType);

    int upBigType(BigType bigType);


    BigType findBigTypeByIdCard(BigType bigType);

    List<BigType> querryAllBigType(BigType bigType);
}
