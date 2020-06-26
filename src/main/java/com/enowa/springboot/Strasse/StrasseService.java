package com.enowa.springboot.Strasse;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StrasseService {
	
	@Autowired
	private StrasseRepository strasseRepository;
	
	public void addStrasse(Strasse strasse) {
		strasseRepository.save(strasse);
	}
	
	public List<Strasse> getAllStrasse(){
		List<Strasse> strasse = new ArrayList<Strasse>();
		strasseRepository.findAll().forEach(strasse::add);
		return strasse;
	}
	
	public List<Strasse> getStrasseInStadt(String plz){
		List<Strasse> strasse = new ArrayList<Strasse>();
		strasseRepository.findByStadtPlz(plz).forEach(strasse::add);
		return strasse;
	}
	

}
