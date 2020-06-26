package com.enowa.springboot.Spezies;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeziesService {
	
	@Autowired
	private SpeziesRepository speziesRepository;
	
	public void addSpezies(Spezies spezies) {
		speziesRepository.save(spezies);
		
	}
	public List<Spezies> getAllSpezies()
	{
		List<Spezies> spezies = new ArrayList<Spezies>();
		speziesRepository.findAll().forEach(spezies::add);
		return spezies;
	}

}
