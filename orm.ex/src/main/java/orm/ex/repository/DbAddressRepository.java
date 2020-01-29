package orm.ex.repository;

import java.util.List;

import orm.ex.model.Address;

public interface DbAddressRepository {
 
	public Address addAaddress(Address address);
	
	public List<Address> getAllAddresses(); 
}
