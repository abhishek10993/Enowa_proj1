package com.enowa.springboot.Spezies;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.enowa.springboot.Baum.Baum;

@Entity
public class Spezies {
	@Id
	private String botanischerName;
	private String trivialName;
	@OneToMany
	private List<Baum> baum;
	
	public Spezies() {
		
	}
	public Spezies(String botanischerName, String trivialName, List<Baum> baum) {
		super();
		this.botanischerName = botanischerName;
		this.trivialName = trivialName;
		this.baum = baum;
	}
	public List<Baum> getBaum() {
		return baum;
	}
	public void setBaum(List<Baum> baum) {
		this.baum = baum;
	}
	public String getBotanischerName() {
		return botanischerName;
	}
	public void setBotanischerName(String botanischerName) {
		this.botanischerName = botanischerName;
	}
	public String getTrivialName() {
		return trivialName;
	}
	public void setTrivialName(String trivialName) {
		this.trivialName = trivialName;
	}
}
