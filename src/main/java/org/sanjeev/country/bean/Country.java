package org.sanjeev.country.bean;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity(name = "ForeignKeyAssoAccountEntity")
@Table(name = "COUNTRY_TABLE") 
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COUNTRY_ID ", unique = true, nullable = false) // name="COUNTRY_ID"
	private int countryId;
	
	@Column(name = "COUNTRY_NAME ", unique = true, nullable = false) 
	private String countryName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="LANGUAGE")
	private Language language;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CAPITAL")
	private City city;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinTable(name="COUNTRY_SPORTS", joinColumns={@JoinColumn(referencedColumnName="COUNTRY_ID")}
                                        , inverseJoinColumns={@JoinColumn(referencedColumnName="SPORT_ID")}) 
	private Set<Sports> sports;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Set<Sports> getSports() {
		return sports;
	}

	public void setSports(Set<Sports> sports) {
		this.sports = sports;
	}
	
	

}
