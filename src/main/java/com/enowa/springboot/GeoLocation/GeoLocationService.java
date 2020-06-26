package com.enowa.springboot.GeoLocation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeoLocationService {
	
	@Autowired
	private GeoLocationRepository geoLocationRepository;
	
	public List<GeoLocation> getAllLocation() {
		List<GeoLocation> geoLocation = new ArrayList<GeoLocation>();
		geoLocationRepository.findAll().forEach(geoLocation::add);
		return geoLocation;
	}
	
	public void addLocation(GeoLocation geoLocation) {
		geoLocationRepository.save(geoLocation);
	}

}
