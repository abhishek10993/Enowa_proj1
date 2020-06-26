package com.enowa.springboot.Stadt;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StadtController {
	
	@Autowired
	private StadtService stadtService;
	
	@RequestMapping("/stadt")
	public List<Stadt> getAllStadt() {
		return stadtService.getAllStadt();
	}
	
	@RequestMapping("/stadt/{plz}")
	public Optional<Stadt> getStadt(@PathVariable String plz) {
		return stadtService.getStadt(plz);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/stadt")
	public void addStadt(@RequestBody Stadt stadt) {
		stadtService.addStadt(stadt);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/stadt/{id}")
	public void updateStadt(@RequestBody Stadt stadt, @PathVariable String plz) {
		stadtService.updateStadt(stadt, plz);
	}

	@RequestMapping(method=RequestMethod.DELETE, value = "/stadt/{plz}")
	public void deleteStadt(@PathVariable String plz) {
		stadtService.deleteStadt(plz);
	}
}
