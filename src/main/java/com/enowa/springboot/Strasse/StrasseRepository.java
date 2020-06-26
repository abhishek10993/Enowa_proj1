package com.enowa.springboot.Strasse;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StrasseRepository extends CrudRepository<Strasse, String> {
	
	public List<Strasse> findByStadtPlz(String plz);

}
