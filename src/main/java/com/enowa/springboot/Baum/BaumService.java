package com.enowa.springboot.Baum;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaumService {
	
	@Autowired
	private BaumRepository baumRepository;
	
	public void addBaum(Baum baum) {
		baumRepository.save(baum);
		
	}
	public List<Baum> getAllBaum()
	{
		List<Baum> baum = new ArrayList<Baum>();
		baumRepository.findAll().forEach(baum::add);
		return baum;
	}

}
