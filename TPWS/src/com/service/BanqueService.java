package com.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.metier.Compte;

@WebService(name="BanqueWs")
public class BanqueService {

	@WebMethod(operationName = "ConversionEutoToDh")
	public double conversion(@WebParam(name = "montant") double mt) {
		return mt*11.3;
	}
	
	@WebMethod
	public Compte getCompte(@WebParam(name = "code") Long code) {
		return new Compte(code, Math.random()*8000,new Date());
	}
	
	@WebMethod
	public List<Compte> getComptes(){
		List<Compte> cptes = new ArrayList<>();
		cptes.add(new Compte(1L, Math.random()*8000,new Date()));
		cptes.add(new Compte(2L, Math.random()*8000,new Date()));
		cptes.add(new Compte(3L, Math.random()*8000,new Date()));

		return cptes; 
	}
	
	
	
}
