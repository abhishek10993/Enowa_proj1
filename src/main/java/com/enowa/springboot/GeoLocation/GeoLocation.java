package com.enowa.springboot.GeoLocation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.enowa.springboot.Baum.Baum;

@Entity
public class GeoLocation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="my_entity_seq_gen")
	@SequenceGenerator(name="my_entity_seq_gen", sequenceName="MY_LOCATION_SEQ")
	private long locationId;
	private float latitude;
	private float longitude;
	@OneToOne
	private Baum baum;
	
	public GeoLocation() {
		
	}
	
	public GeoLocation(long locationId, float latitude, float longitude, Baum baum) {
		super();
		this.locationId = locationId;
		this.latitude = latitude;
		this.longitude = longitude;
		this.baum = baum;
	}
	
	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public Baum getBaum() {
		return baum;
	}
	public void setBaum(Baum baum) {
		this.baum = baum;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

}
