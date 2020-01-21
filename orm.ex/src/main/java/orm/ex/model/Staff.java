package orm.ex.model;

import java.sql.Blob;
import java.sql.Timestamp;

public class Staff {
	private int StaffId;
	private String staffName;
	private String staffLastName;
	private Address address;
	private Blob picture;
	private String email;
	private Store store;
	private boolean active;
	private String username;
	private String password;
	private Timestamp lastUpdate;

	public int getStaffId() {
		return StaffId;
	}

	public void setStaffId(int staffId) {
		StaffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffLastName() {
		return staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
