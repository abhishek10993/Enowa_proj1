package com.enowa.springboot.Stadt;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.enowa.springboot.Strasse.Strasse;

@Entity
public class Stadt {
	
	@Id
	private String plz;
	private String name;
	@OneToMany
	@Size(min=10, max=200)
	
	private List<Strasse> strasse = new ArrayList<Strasse>();
	
	public Stadt()
	{
		
	}
	
	public Stadt(String plz, String name, List<Strasse> strasse) {
		super();
		this.plz = plz;
		this.name = name;
		this.strasse = strasse;
	}


	public List<Strasse> getStrasse() {
		return strasse;
	}

	public void setStrasse(List<Strasse> strasse) {
		this.strasse = strasse;
	}

	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
