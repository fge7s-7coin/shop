package service.impl;

import entity.Address;
import mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AddressService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("addressService")
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public int addAddress(Address address) {
        Address recore = addressMapper.findAddressByconsignee(address);
        if (recore == null)
        {
            String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
            address.setId(uuid);
            address.setCreateTime(sdf.format(date));
            address.setDelFlag("0");
            return addressMapper.addRess(address);
        }
        return 0;
    }

    @Override
    public int delAddress(Address address) {
        return addressMapper.delAddress(address);
    }

    @Override
    public int upAddress(Address address) {
        return addressMapper.upAddress(address);
    }

    @Override
    public List<Address> querryAddress(Address address) {
        return addressMapper.querryAddress(address);
    }

    @Override
    public List<Address> querryAddressByconsignee(Address address) {
        return addressMapper.querryAddressByconsignee(address);
    }
}
