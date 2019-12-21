package org.sanjeev.country.service;

import java.util.List;

import org.sanjeev.country.bean.Country;
import org.sanjeev.country.dao.CountryDao;
import org.sanjeev.country.dao.CountryDaoImpl;

public class CountryServiceImpl implements CountryService {

	CountryDao cdao = new CountryDaoImpl();

	@Override
	public int insertCountry(Country country) {

		return cdao.insertCountry(country);
	}

	@Override
	public List<Country> fetchAllCountryInfo() {

		List<Country> list = cdao.fetchCountryInfo();
		for (Country l : list) {
			System.out.println("randao m test " );
			System.out.println("service fetch sport set size" + l.getSports().size());
		}

		return list;
	}

}
