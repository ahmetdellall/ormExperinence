package orm.ex.model;

import java.sql.Timestamp;

public class City {

	private int cityId;
	private int cityName;
	private Country country;
	private Timestamp cityLastUpdate;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getCityName() {
		return cityName;
	}

	public void setCityName(int cityName) {
		this.cityName = cityName;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Timestamp getCityLastUpdate() {
		return cityLastUpdate;
	}

	public void setCityLastUpdate(Timestamp cityLastUpdate) {
		this.cityLastUpdate = cityLastUpdate;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", country=" + country + ", cityLastUpdate="
				+ cityLastUpdate + "]";
	}

}
