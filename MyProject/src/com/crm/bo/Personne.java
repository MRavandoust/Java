/**
 * 
 */
package com.crm.bo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author Masoud RAVANDOUST
 */

public class Personne {
	// Attributs
	public String surnom;
	private String nom;
	private String prenom;
	protected Date dateNaissance;

	// Methodes

	

//	public void setDateNaissance(Date date) {
//		dateNaissance = date;
//	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setDateNaissance(String str) {
		
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//dateNaissance = dtf.
		System.out.println(myDateObj.format(dtf));
		
		
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		try {
//			dateNaissance = sdf.parse(str);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public void afficherDetails() {
		System.out.println("vous etes : " + getPrenom() + " " + getNom() + "(" + surnom + ")");

	}

}
