package service;

import entity.Address;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Service
public interface AddressService {
    int addAddress(Address address);

    int delAddress(Address address);

    int upAddress(Address address);

    List<Address> querryAddress(Address address);

    List<Address> querryAddressByconsignee(Address address);

    List<Address> getAddress(HttpServletRequest request);

    Address findById(Address recored);

    int add(Address address);
}



