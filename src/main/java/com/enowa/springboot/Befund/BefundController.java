package com.enowa.springboot.Befund;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BefundController {
	
	@Autowired
	private BefundService befundService;
	
	@RequestMapping("/befund")
	public List<Befund> getAllBefund() {
		return befundService.getAllBefund();
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/befund")
	public void addStadt(@RequestBody Befund befund) {
		befundService.addBefund(befund);
	}

}
