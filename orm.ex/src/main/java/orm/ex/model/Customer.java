package orm.ex.model;


import java.util.Date;

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
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "SMALLINT", nullable = false)
	private int customerId;
	
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Store.class)
	@JoinColumn(name = "storeId", nullable = false, referencedColumnName = "StoreId", columnDefinition = "TINYINT")
	private Store store;
	
	@Column(length = 45, nullable = false)
	private String customerFirstName;
	@Column(length = 45, nullable = false)
	private String customerLastName;
	@Column(length = 50, nullable = true )
	private String email;
	
	@ManyToOne(targetEntity = Address.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "adressId", nullable = false, columnDefinition = "SMALLINT")
	private Address address;
	@Column(nullable = false, columnDefinition = "bit default 0" )
	private boolean active;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition =  "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date customerCreateDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition =  "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date lastUpdateCostumer;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCustomerCreateDate() {
		return customerCreateDate;
	}

	public void setCustomerCreateDate(Date customerCreateDate) {
		this.customerCreateDate = customerCreateDate;
	}

	public Date getLastUpdateCostumer() {
		return lastUpdateCostumer;
	}

	public void setLastUpdateCostumer(Date lastUpdateCostumer) {
		this.lastUpdateCostumer = lastUpdateCostumer;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", store=" + store + ", customerFirstName=" + customerFirstName
				+ ", customerLastName=" + customerLastName + ", email=" + email + ", address=" + address + ", active="
				+ active + ", customerCreateDate=" + customerCreateDate + ", lastUpdateCostumer=" + lastUpdateCostumer
				+ "]";
	}

}
