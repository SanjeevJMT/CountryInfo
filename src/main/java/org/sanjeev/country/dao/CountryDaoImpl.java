package org.sanjeev.country.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.sanjeev.country.bean.Country;
import org.sanjeev.country.db.HibernateUtility;

public class CountryDaoImpl implements CountryDao {

	@Override
	public int insertCountry(Country country) {

		Session session = HibernateUtility.getSession();
		int countryId = 0;
		try {
			session.beginTransaction();
			// saving the country Info
			countryId = (Integer) session.save(country);

			session.getTransaction().commit();
			session.close();
			return countryId;
		} catch (HibernateException e) {
			
			System.out.println("HibernateException in insertCountry()");
			e.printStackTrace();
			session.getTransaction().rollback();
			session.close();
			return countryId;
		} finally {
		}
	}

	@Override
	public List<Country> fetchCountryInfo() {

		Session session = HibernateUtility.getSession();
		try {
			session.beginTransaction();

			EntityManager entityManager = session.getEntityManagerFactory().createEntityManager();
			CriteriaBuilder builder = entityManager.getCriteriaBuilder();
			CriteriaQuery<Country> criteria = builder.createQuery(Country.class);
			Root<Country> root = criteria.from(Country.class);
			criteria.select(root);

			List<Country> listOfCountryInfo = entityManager.createQuery(criteria).getResultList();

			session.getTransaction().commit();
			session.close();
			return listOfCountryInfo;
		} catch (HibernateException e) {
			session.close();
			System.out.println("HibernateException in fetchCountry()");
			e.printStackTrace();
			session.getTransaction().rollback();
			session.close();
			return null;
		}

	}

}
