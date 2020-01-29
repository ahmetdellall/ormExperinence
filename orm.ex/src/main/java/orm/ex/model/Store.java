package orm.ex.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false,columnDefinition = "TINYINT",unique = true)
	private int storeId;
	

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "menager_staff_id")
	private List<Staff> menagerstaff= new ArrayList<Staff>();
	
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Address.class)
	@JoinColumn(name = "addressId",columnDefinition = "SMALLINT", nullable = false)
	private Address address;
	@Temporal( TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition =  "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date lastUpdate;

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	

	public List<Staff> getMenagertaff() {
		return menagerstaff;
	}

	public void setMenagertaff(List<Staff> menagertaff) {
		this.menagerstaff = menagertaff;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
