package orm.ex.model;

import java.sql.Blob;
import java.sql.Timestamp;

public class Address {
	
	private int addresId;
	private String address;
	private String addressTwo;
	private String district;
	private City city;
	private int postalCode;
	private String phoneNumber;
	private Blob location;
	private Timestamp addressLastUpdate;

	public int getAddresId() {
		return addresId;
	}

	public void setAddresId(int addresId) {
		this.addresId = addresId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressTwo() {
		return addressTwo;
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Blob getLocation() {
		return location;
	}

	public void setLocation(Blob location) {
		this.location = location;
	}

	public Timestamp getAddressLastUpdate() {
		return addressLastUpdate;
	}

	public void setAddressLastUpdate(Timestamp addressLastUpdate) {
		this.addressLastUpdate = addressLastUpdate;
	}

	@Override
	public String toString() {
		return "Address [addresId=" + addresId + ", address=" + address + ", addressTwo=" + addressTwo + ", district="
				+ district + ", city=" + city + ", postalCode=" + postalCode + ", phoneNumber=" + phoneNumber
				+ ", location=" + location + ", addressLastUpdate=" + addressLastUpdate + "]";
	}
}
