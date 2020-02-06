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
		Personne pers = new Personne("Masoud" , "RAVANDOUST");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Entrez votr prenom :");
//		String prenom = sc.nextLine();
//		System.out.println("Entrez votr nom :");
//		String nom = sc.nextLine();
//		System.out.println("Entrez votr surnom :");
//		String surnom1 = sc.nextLine();
//		pers.surnom = surnom1;
//		pers.setNom(nom);
//		pers.setPrenom(prenom);
//		pers.setDateNaissance("22/08/1975");
//		System.out.println(pers.getDateNaissance());
		
		//System.out.println("bienvenue " + pers.getNom() + " (" + pers.surnom + ")" );
		
		pers.afficherDetails();
		
		//Déclancher une exeption suite au déréférencement de l'objet
//		Personne pers2 = new Personne();
//		pers2 = null;
//		pers2.afficherDetails();
		
		// cet exemple est pour montrer assegnement par reference 
		int a = 5;
		int b = 5;
		if(a==b)
			System.out.println("a = b");
		
		Personne pers3 = new Personne("Masoud" , "RAVANDOUST");
		Personne pers4 = new Personne("Masoud" , "RAVANDOUST");
		
		if(pers3 == pers4)
			System.out.println("pers3 = pers4");
		
		//
		if(pers3.isEquals(pers4) == true)
			System.out.println("les deux objets sont identique");
		
		//
		int nb = 5;
		pers4.incremente(nb);
		System.out.println(nb);
		
		//
		pers3.modifierPersonne(pers4);
		pers4.afficherDetails();

	}

}
