/**
 * 
 */
package com.crm.boapp;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import com.crm.bo.Personne;

/**
* @author Masoud RAVANDOUST
*/

public class PersonneApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne pers = new Personne();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votr prenom :");
		String prenom = sc.nextLine();
		System.out.println("Entrez votr nom :");
		String nom = sc.nextLine();
		System.out.println("Entrez votr surnom :");
		String surnom1 = sc.nextLine();
		pers.surnom = surnom1;
		pers.setNom(nom);
		pers.setPrenom(prenom);
		pers.setDateNaissance("22/08/1975");
		System.out.println(pers.getDateNaissance());
		
		//System.out.println("bienvenue " + pers.getNom() + " (" + pers.surnom + ")" );
		
		pers.afficherDetails();
				

	}

}
