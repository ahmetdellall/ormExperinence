package orm.ex.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true, columnDefinition = "SMALLINT")
	private int addresId;

	@Column(length = 50, nullable = false)
	private String address;
	
	@Column(length = 50, nullable = true, columnDefinition = " VARCHAR(50) DEFAULT NULL")
	private String addressTwo;

	@Column(length = 50, nullable = false)
	private String district;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cityId", referencedColumnName = "cityId", nullable = false)
	private City city;

	@Column(length = 10, nullable = false)
	private int postalCode;
	@Column(length = 20, nullable = false)
	private String phoneNumber;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition =  "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date addressLastUpdate;

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

	public Date getAddressLastUpdate() {
		return addressLastUpdate;
	}

	public void setAddressLastUpdate(Date addressLastUpdate) {
		this.addressLastUpdate = addressLastUpdate;
	}

	@Override
	public String toString() {
		return "Address [addresId=" + addresId + ", address=" + address + ", addressTwo=" + addressTwo + ", district="
				+ district + ", city=" + city + ", postalCode=" + postalCode + ", phoneNumber=" + phoneNumber
				+ ", addressLastUpdate=" + addressLastUpdate + "]";
	}
}
