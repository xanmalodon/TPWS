package com.serveur;

import javax.xml.ws.Endpoint;

import com.service.BanqueService;

public class ServeurJWS {

	public static void main(String[] args) {
		// mettre adresse IP du pc si veut accessibilite a distance
		String url = "http://localhost:8585/";
		Endpoint.publish(url, new BanqueService());
		System.out.println(url);
		// pr le lancer, il suffit de faire run as Application Java 
		// http://localhost:8585/BanqueWS?wsdl
		// ci dessus, permet d'avoir une idee de l'interface du WS
		// utilisation de SoapUI ou Oxygen
	}

}
