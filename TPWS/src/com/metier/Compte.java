package com.metier;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="cp")
public class Compte implements Serializable{

	private Long code; 
	
	private double solde; 
	
	private Date datecreation;

	
	
	public Compte() {
		super();
	}

	public Compte(Long code, double solde, Date datecreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.datecreation = datecreation;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	// annotation ci dessous qui permet de ne pas remonter l'informationds le WS
	// a utiliser sur le getter et non les attributs à moins de mettre sur la classe l'annotation
	// @XmlAccessorType(XmlAccessType.FIELD) => scan sur les attributs
	@XmlTransient
	public Date getDatecreation() {
		return datecreation;
	}

	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	
	
}
