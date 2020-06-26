package com.enowa.springboot.Baum;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.enowa.springboot.Befund.Befund;
import com.enowa.springboot.GeoLocation.GeoLocation;
import com.enowa.springboot.Spezies.Spezies;
import com.enowa.springboot.Strasse.Strasse;

@Entity
public class Baum {
	
	@Id
	private long nummer;
	private Date pflanzdatum;
	@OneToMany
	private List<Befund> befund = new ArrayList<Befund>();
	@ManyToOne(fetch = FetchType.LAZY)
	private Spezies species;
	@OneToOne
	private GeoLocation geoLocation;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STRASSE_NAME")
	private Strasse strasse;
	
	public Baum() {
		
	}
	
	public Baum(long nummer, Date pflanzdatum, List<Befund> befund, Spezies species, GeoLocation geoLocation, Strasse strasse) {
		super();
		this.nummer = nummer;
		this.pflanzdatum = pflanzdatum;
		this.befund = befund;
		this.species = species;
		this.geoLocation = geoLocation;
		this.strasse = strasse;
	}

	public List<Befund> getBefund() {
		return befund;
	}

	public void setBefund(List<Befund> befund) {
		this.befund = befund;
	}

	public Spezies getSpecies() {
		return species;
	}

	public void setSpecies(Spezies species) {
		this.species = species;
	}

	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	public long getNummer() {
		return nummer;
	}
	
	public void setNummer(long nummer) {
		this.nummer = nummer;
	}
	public Date getPflanzdatum() {
		return pflanzdatum;
	}
	public void setPflanzdatum(Date pflanzdatum) {
		this.pflanzdatum = pflanzdatum;
	}

}
