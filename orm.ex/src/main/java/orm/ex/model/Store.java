package orm.ex.model;

import java.sql.Timestamp;

public class Store {

	private int storeId;
	private Staff menagertaff;
	private Address address;
	private Timestamp lastUpdate;

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public Staff getMenagertaff() {
		return menagertaff;
	}

	public void setMenagertaff(Staff menagertaff) {
		this.menagertaff = menagertaff;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
