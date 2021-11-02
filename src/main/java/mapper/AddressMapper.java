package mapper;

import entity.Address;

import java.util.List;

public interface AddressMapper {

    int addRess(Address address);
    Address findAddressByconsignee(Address address);
    int delAddress(Address address);

    int upAddress(Address address);

    List<Address> querryAddress(Address address);

    List<Address> querryAddressByconsignee(Address address);
}
