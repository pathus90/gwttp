package com.tp.cours.client.shared;

public abstract class User {
	protected int id;
	protected String nom;
	protected String pwd;

	public User(int id, String nom, String pwd) {
		super();
		this.id = id;
		this.nom = nom;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public abstract String getType();
}
