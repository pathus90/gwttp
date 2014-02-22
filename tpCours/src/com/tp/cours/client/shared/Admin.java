package com.tp.cours.client.shared;

public class Admin extends User{

	public Admin(String nom, String pwd) {
		super(nom, pwd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return Parametres.typeAdmin;
	}
}
