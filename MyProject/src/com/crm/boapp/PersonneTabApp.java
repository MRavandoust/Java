/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Personne;

/**
* @author Masoud RAVANDOUST
*/

public class PersonneTabApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declaration des variables
	//Personne[] persTab = new Personne[2];
	//Personne pers1 = new Personne();
	//Personne pers2 = new Personne();
	
		Personne pers3 = new Personne("Ali", "Ravandoust");
		pers3.afficherDetails();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Entrez le nombre des personnes :");
	int taille = sc.nextInt();
	Personne[] persTab = new Personne[taille];
	
	for(int i =0; i < taille; i++) {
		Personne pers = new Personne();
		System.out.println("Entrez votr prenom :");
		String prenom = sc.next();
		pers.setPrenom(prenom);
		System.out.println("Entrez votr nom :");
		String nom = sc.next();
		pers.setNom(nom);
		System.out.println("Entrez votr Surnom :");
		String surnom = sc.next();
		pers.setSurnom(surnom);
		persTab[i] = pers;
		
	}
	
//	Personne pers1 = new Personne();
//	
//	
//	//Initialisation
//	pers1.setPrenom("Ali");
//	pers1.setNom("RAVANDOUST");
//	
//	pers2.setPrenom("Hajar");
//	pers2.setNom("RAVANDOUST");
//	pers2.surnom = "Khaled";
//	
//	persTab[0] = pers1;
//	persTab[1] = pers2;
	
	//Parcours du tableau
	for (Personne p : persTab)
		p.afficherDetails();
	
	sc.close();
		
	

	}

}
