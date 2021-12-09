package service.impl;

import entity.SmallType;
import mapper.SmallTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.SmallTypeService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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

    @Override
    public List<SmallType> getSmallType(SmallType smallType) {
        return smallTypeMapper.getSmallType(smallType);
    }

    @Override
    public SmallType findById(SmallType recored) {
        return smallTypeMapper.findById(recored);
    }

    @Override
    public int add(SmallType smallType) {
        if (smallType.getId()==null || smallType.getId()==""){
            SmallType recore = smallTypeMapper.findSmallByIdCard(smallType);
            if (recore==null)
            {
                String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
                smallType.setId(uuid);
                smallType.setCreateTime(sdf.format(date));
                smallType.setDelFlag("0");
                return smallTypeMapper.addSmallType(smallType);
            }
        }
        else {
            return smallTypeMapper.upSmallType(smallType);
        }
        return 0;
    }
}
