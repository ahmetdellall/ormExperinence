package orm.ex.model;

import java.sql.Timestamp;

public class Customer {
	private int customerId;
	private Store store;
	private String customerFirstName;
	private String customerLastName;
	private String email;
	private Address address;
	private boolean active;
	private Timestamp customerCreateDate;
	private Timestamp lastUpdateCostumer;

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

	public Timestamp getCustomerCreateDate() {
		return customerCreateDate;
	}

	public void setCustomerCreateDate(Timestamp customerCreateDate) {
		this.customerCreateDate = customerCreateDate;
	}

	public Timestamp getLastUpdateCostumer() {
		return lastUpdateCostumer;
	}

	public void setLastUpdateCostumer(Timestamp lastUpdateCostumer) {
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
