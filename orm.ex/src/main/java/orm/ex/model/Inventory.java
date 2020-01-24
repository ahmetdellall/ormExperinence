package orm.ex.model;

import java.io.Serializable;

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
public class Inventory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "mediumint", nullable = false)
	private int inventoryId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "film_id", columnDefinition = "smallint", nullable = false)
	private Film film;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "store_id", columnDefinition = "tinyint", nullable = false)
	private Store store;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update")
	private Date lastupdate;

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

	public Date getLastupdate() {
		return lastupdate;
	}

	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}

}
