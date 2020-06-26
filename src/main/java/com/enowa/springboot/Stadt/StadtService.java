package com.enowa.springboot.Stadt;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StadtService {
	
	@Autowired
	private StadtRepository stadtRepository;
	
	//private List<Stadt> stadtAll = Arrays.asList(new Stadt("70569", "Stuttgart"),new Stadt("56045", "Frankfurt"));
	
	public List<Stadt> getAllStadt()
	{
		List<Stadt> stadt = new ArrayList<Stadt>();
		stadtRepository.findAll().forEach(stadt::add);
		return stadt;
	}
	
	public Optional<Stadt> getStadt(String plz) {
		return stadtRepository.findById(plz);
	}

	public void addStadt(Stadt stadt) {
		stadtRepository.save(stadt);
		
	}

	public void updateStadt(Stadt stadt, String plz) {
		stadtRepository.save(stadt);
		
	}

	public void deleteStadt(String plz) {
		stadtRepository.deleteById(plz);
	}

}
