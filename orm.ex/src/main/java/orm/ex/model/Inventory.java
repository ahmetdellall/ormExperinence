package orm.ex.model;

import java.sql.Timestamp;

public class Inventory {
	
	private int inventoryId;
	private Film film;
	private Store store;
	private Timestamp lastupdate;
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Timestamp getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(Timestamp lastupdate) {
		this.lastupdate = lastupdate;
	}
	
	

}
