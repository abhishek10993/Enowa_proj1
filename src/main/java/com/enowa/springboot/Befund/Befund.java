package com.enowa.springboot.Befund;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.enowa.springboot.Baum.Baum;

@Entity
public class Befund {
	
	@Id
	private long befundId;
	private Date erhobenAm;
	private String beschreibung;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BAUM_NUMMER")
	private Baum baum;
	
	public Befund(){
		
	}
	
	public Befund(long befundId, Date erhobenAm, String beschreibung, Baum baum) {
		super();
		this.befundId = befundId;
		this.erhobenAm = erhobenAm;
		this.beschreibung = beschreibung;
		this.baum = baum;
	}

	public long getBefundId() {
		return befundId;
	}

	public void setBefundId(long befundId) {
		this.befundId = befundId;
	}

	public Baum getBaum() {
		return baum;
	}

	public void setBaum(Baum baum) {
		this.baum = baum;
	}

	public Date getErhobenAm() {
		return erhobenAm;
	}
	public void setErhobenAm(Date erhobenAm) {
		this.erhobenAm = erhobenAm;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

}
