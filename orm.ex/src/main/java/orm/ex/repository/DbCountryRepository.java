package orm.ex.repository;

import java.util.List;

import orm.ex.model.Country;

public interface DbCountryRepository {
	
	public Country addACountry(Country country);
	
	public List<Object[]> getCountriesId(List<String> countryNames);
	}
