package com.enowa.springboot.Strasse;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StrasseController {
	
	@Autowired
	private StrasseService strasseService;
	
	@RequestMapping("/strasse")
	public List<Strasse> getAllStrasse() {
		return strasseService.getAllStrasse();
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value = "/strasse")
	public void addStrasse(@RequestBody Strasse strasse) {
		strasseService.addStrasse(strasse);
	}
	
	@RequestMapping("/strasse/{plz}")
	public List<Strasse> getStrasseInStadt(@PathVariable String plz) {
		return strasseService.getStrasseInStadt(plz);
	}

}
