package org.sanjeev.country.service;

import java.util.List;

import org.sanjeev.country.bean.Country;

public interface CountryService {

	int insertCountry(Country country);

	List<Country> fetchAllCountryInfo();

}
