package service.impl;

import entity.BigType;
import mapper.BigTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BigTypeService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class BigTypeServiceImpl implements BigTypeService {

    @Autowired
    private BigTypeMapper bigTypeMapper;

    public int addBigType(BigType bigType) {
        BigType recore = bigTypeMapper.findBigTypeByIdCard(bigType);
        if (recore==null){
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
            bigType.setCreateTime(sdf.format(date));
            bigType.setDelFlag("0");
            return bigTypeMapper.addBigType(bigType);
        }
        return 0;

    }

    @Override
    public int delBigType(BigType bigType) {
        return bigTypeMapper.delBigType(bigType);
    }

    @Override
    public int upBigType(BigType bigType) {
        return bigTypeMapper.upBigType(bigType);
    }

    @Override
    public List<BigType> querryAllBigType(BigType bigType) {
        return bigTypeMapper.querryAllBigType(bigType);
    }

    @Override
    public List<BigType> findBigtype(BigType bigtype) {
        return bigTypeMapper.findBigType(bigtype);
    }

    @Override
    public BigType findById(BigType recored) {
        return bigTypeMapper.findBigTypeById(recored);
    }


}
