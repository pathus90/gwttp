package com.tp.cours.client.shared;

import java.util.ArrayList;

public class Tableau {
	private ArrayList<Questionnaire> questionnaires;
	
	private int getId(int index) {
		return this.questionnaires.get(index).getId();
	}

	public Tableau() {
		super();
		this.questionnaires = new ArrayList<Questionnaire>();
	}
	
	public void append(Questionnaire q) {
		if(q.getUser().getType() == Parametres.typeAdmin) {
			//System.out.println("admin cant be appended!");
			return;
		}
		for(int i = 0; i < this.questionnaires.size(); i++) {
			if(getId(i) == q.getId()) {
				//System.out.println("exist!");
				return;
			}
			this.questionnaires.add(q);
		}
	}
	
	public void removeAt(int index) {
		this.questionnaires.remove(index);
	}
	
	public void modifierNom(int index, String nom) {
		this.questionnaires.get(index).setNom(nom);
	}
	
	public void modifierDateDebut(int index, String dateDebut) {
		this.questionnaires.get(index).setDateDebut(dateDebut);
	}
	
	public void modifierDateFin(int index, String dateFin) {
		this.questionnaires.get(index).setDateFin(dateFin);
	}
	
	public void modifierDescription(int index, String description) {
		this.questionnaires.get(index).setDescription(description);
	}
}
