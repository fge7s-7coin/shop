package service;

import entity.SmallType;

import java.util.List;

public interface SmallTypeService {
    int addSmallType(SmallType smallType);

    int delSmallType(SmallType smallType);

    int upSmallType(SmallType smallType);

    List<SmallType> querrySmallType(SmallType smallType);
}
