package org.sanjeev.country.dao;

import java.sql.SQLException;
import java.util.List;

import org.sanjeev.country.bean.Country;

public interface CountryDao {

	int insertCountry(Country country);

	List<Country> fetchCountryInfo();

}
