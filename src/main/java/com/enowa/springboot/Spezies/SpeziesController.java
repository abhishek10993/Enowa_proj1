package com.enowa.springboot.Spezies;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeziesController {
	
	@Autowired
	private SpeziesService speziesService;
	
	@RequestMapping("/spezies")
	public List<Spezies> getAllSpezies() {
		return speziesService.getAllSpezies();
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value = "/spezies")
	public void addBaum(@RequestBody Spezies spezies) {
		speziesService.addSpezies(spezies);
	}

}
