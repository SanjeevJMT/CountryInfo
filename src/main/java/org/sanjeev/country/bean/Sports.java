package org.sanjeev.country.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "SPORT_TABLE", uniqueConstraints = { @UniqueConstraint(columnNames = "SPORT_ID") })
public class Sports {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SPORT_ID", unique = true, nullable = false)
	private int sportId;
	private String sportName;

	@ManyToMany(mappedBy = "sports")
	private Set<Country> countries;

	
	
	
	public int getSportId() {
		return sportId;
	}

	public void setSportId(int sportId) {
		this.sportId = sportId;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

}
