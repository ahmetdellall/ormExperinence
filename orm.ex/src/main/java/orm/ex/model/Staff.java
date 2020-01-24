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
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false,unique = true, columnDefinition = "TINYINT")
	private int StaffId;
	@Column(length = 45,nullable = false)
	private String staffName;
	@Column(length = 45, nullable = false)
	private String staffLastName;
	
	@ManyToOne(fetch = FetchType.EAGER,  targetEntity = Address.class)
	@JoinColumn(name = "addressId", nullable = false, columnDefinition = "SMALLINT")
	private Address address;
	
	@Column(length = 50, nullable = true)
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "store_id", nullable = false)
	private Store store;
	
	@Column(columnDefinition = "BOOLEAN DEFAULT TRUE", nullable = false)
	private boolean active;
	@Column(length = 16, nullable = false)
	private String username;
	@Column(length = 45, columnDefinition = "BINARY DEFAULT NULL")
	private String password;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date lastUpdate;

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

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
