package service.impl;

import entity.SmallType;
import mapper.SmallTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SmallTypeService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("smallTypeService")
public class SmallTypeServiceImpl implements SmallTypeService {
    @Autowired
    private SmallTypeMapper smallTypeMapper;

    @Override
    public int addSmallType(SmallType smallType) {
        SmallType recore = smallTypeMapper.findSmallByIdCard(smallType);
        if (recore==null)
        {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
            smallType.setCreateTime(sdf.format(date));
            smallType.setDelFlag("0");
            return smallTypeMapper.addSmallType(smallType);
        }
        return 0;
    }

    @Override
    public int delSmallType(SmallType smallType) {
        return smallTypeMapper.delSmallType(smallType);
    }

    @Override
    public int upSmallType(SmallType smallType) {
        return smallTypeMapper.upSmallType(smallType);
    }

    @Override
    public List<SmallType> querrySmallType(SmallType smallType) {
        return smallTypeMapper.querrySmallType(smallType);
    }
}
