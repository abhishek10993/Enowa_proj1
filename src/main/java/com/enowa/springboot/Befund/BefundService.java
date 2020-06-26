package com.enowa.springboot.Befund;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BefundService {
	
	@Autowired
	private BefundRepository befundRepository;
	
	public List<Befund> getAllBefund()
	{
		List<Befund> befund = new ArrayList<Befund>();
		befundRepository.findAll().forEach(befund::add);
		return befund;
	}

	public void addBefund(Befund befund) {
		befundRepository.save(befund);
		
	}
}
