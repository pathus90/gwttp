package com.tp.cours.client.shared;

public class Questionnaire {
	private User user;
	private String dateDebut, dateFin;
	private String description;
	
	public Questionnaire(User user, String dateDebut, String dateFin,
			String description) {
		super();
		this.user = user;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getId() {
		return this.user.getId();
	}
	
	public void setNom(String nom) {
		this.user.setNom(nom);
	}
}
