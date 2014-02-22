package com.tp.cours.client.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasVerticalAlignment;

public class Login extends Composite {

	public Login() {
		
		VerticalPanel verticalPanel = new VerticalPanel();
		initWidget(verticalPanel);
		verticalPanel.setHeight("156px");
		
		Label lblNewLabel_3 = new Label("Espace Connexion");
		verticalPanel.add(lblNewLabel_3);
		lblNewLabel_3.setStyleName("gwt-Label-connexion");
		
		FlexTable flexTable = new FlexTable();
		verticalPanel.add(flexTable);
		
		Label lblNewLabel_1 = new Label("Login:");
		lblNewLabel_1.setStyleName("gwt-Label-login");
		flexTable.setWidget(0, 0, lblNewLabel_1);
		
		TextBox textBox = new TextBox();
		flexTable.setWidget(0, 1, textBox);
		
		Label lblNewLabel_2 = new Label("Password:");
		lblNewLabel_2.setStyleName("gwt-Label-login");
		flexTable.setWidget(1, 0, lblNewLabel_2);
		
		TextBox textBox_1 = new TextBox();
		flexTable.setWidget(1, 1, textBox_1);
		
		Label lblNewLabel = new Label("Erreur de login");
		lblNewLabel.setStyleName("gwt-Label-error");
		flexTable.setWidget(2, 1, lblNewLabel);
		
		Button btnNewButton = new Button("Login");
		btnNewButton.setStyleName("gwt-Button-login");
		flexTable.setWidget(3, 1, btnNewButton);
	}

}
