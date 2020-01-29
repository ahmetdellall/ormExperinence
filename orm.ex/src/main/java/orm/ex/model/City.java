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
public class City {

	@Id
	@Column(nullable = false,unique = true , columnDefinition = "SMALLINT")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cityId;
	
	@Column(length = 50, nullable = false)
	private String cityName;

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "countryId", referencedColumnName = "countryId", nullable = false, columnDefinition = "SMALLINT")
	private Country country;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, columnDefinition =  "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Date cityLastUpdate;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Date getCityLastUpdate() {
		return cityLastUpdate;
	}

	public void setCityLastUpdate(Date cityLastUpdate) {
		this.cityLastUpdate = cityLastUpdate;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", country=" + country + ", cityLastUpdate="
				+ cityLastUpdate + "]";
	}

}
