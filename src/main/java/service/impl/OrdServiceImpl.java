package service.impl;

import com.sun.tools.corba.se.idl.constExpr.Or;
import entity.Goods;
import entity.Ord;
import entity.User;
import mapper.OrdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrdService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("ordService")
public class OrdServiceImpl implements OrdService {
    @Autowired
    private OrdMapper ordMapper;

    @Override
    public int addOrd(Ord ord) {


        Goods recore = ordMapper.findOrdByIdCard(ord);
        if (recore == null) {

            String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
            ord.setId(uuid);
            ord.setCreateTime(sdf.format(date));
            ord.setDelFlag("0");
            return ordMapper.addOrd(ord);
        }
        return 0;



    }

    @Override
    public int delOrd(Ord ord) {
        return ordMapper.delOrd(ord);
    }

    @Override
    public int upOrd(Ord ord) {
        return ordMapper.upOrd(ord);
    }

    @Override
    public List<User> queryOrd(Ord ord) {
        return ordMapper.queryOrd(ord);
    }

    @Override
    public List<User> queryOrdAll(Ord ord) {
        return ordMapper.queryOrdAll(ord);
    }
}
