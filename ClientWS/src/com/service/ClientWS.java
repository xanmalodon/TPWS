package com.service;

public class ClientWS {

	public static void main(String[] args) {
		BanqueWs stub = new BanqueServiceService().getBanqueWsPort();
		double res = stub.conversionEutoToDh(800);
		System.out.println("800 euros valent "+ res);
	}

}
