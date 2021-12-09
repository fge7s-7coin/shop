package mapper;

import entity.SmallType;

import java.util.List;


public interface SmallTypeMapper {


    int addSmallType(SmallType smallType);

    int delSmallType(SmallType smallType);

    int upSmallType(SmallType smallType);

    List<SmallType> querrySmallType(SmallType smallType);

    SmallType findSmallByIdCard(SmallType smallType);

    List<SmallType> getSmallType(SmallType smallType);

    SmallType findById(SmallType recored);
}
