package com.enowa.springboot.Baum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BaumController {
	
	@Autowired
	private BaumService baumService;
	
	@RequestMapping("/baum")
	public List<Baum> getAllbaum() {
		return baumService.getAllBaum();
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value = "/baum")
	public void addBaum(@RequestBody Baum baum) {
		baumService.addBaum(baum);
	}

}
