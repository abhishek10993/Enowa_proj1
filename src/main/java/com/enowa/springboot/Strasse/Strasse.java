package com.enowa.springboot.Strasse;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.enowa.springboot.Baum.Baum;
import com.enowa.springboot.Stadt.Stadt;

@Entity
public class Strasse {
	
	@Id
	private String name;
	private String verwaltungsKuerzel;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STADT_PLZ")
	private Stadt stadt;
	@OneToMany
	@Size(min=0, max=800)
	private List<Baum> baum = new ArrayList<Baum>();
	
	public Strasse() {
		
	}
	
	public Strasse(String name, String verwaltungsKuerzel, Stadt stadt) {
		super();
		this.name = name;
		this.verwaltungsKuerzel = verwaltungsKuerzel;
		this.stadt = stadt;
	}
	public Stadt getStadt() {
		return stadt;
	}
	public void setStadt(Stadt stadt) {
		this.stadt = stadt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVerwaltungsKuerzel() {
		return verwaltungsKuerzel;
	}
	public void setVerwaltungsKuerzel(String verwaltungsKuerzel) {
		this.verwaltungsKuerzel = verwaltungsKuerzel;
	}

}
