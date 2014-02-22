package com.tp.cours.client.shared;

public class Client extends User{

	public Client(int id, String nom, String pwd) {
		super(id, nom, pwd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return Parametres.typeClient;
	}

}
