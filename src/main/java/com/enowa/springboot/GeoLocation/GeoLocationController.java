package com.enowa.springboot.GeoLocation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GeoLocationController {
	
	@Autowired
	private GeoLocationService geoLocationService;
	
	@RequestMapping("/geolocation")
	public List<GeoLocation> getAllLocations() {
		return geoLocationService.getAllLocation();
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value = "/geolocation")
	public void addBaum(@RequestBody GeoLocation geoLocation) {
		geoLocationService.addLocation(geoLocation);
	}
	
	

}
