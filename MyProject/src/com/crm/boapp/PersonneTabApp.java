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
	Personne[] persTab = new Personne[2];
	Personne pers1 = new Personne();
	Personne pers2 = new Personne();
	
	
	
	//Initialisation
	pers1.setPrenom("Ali");
	pers1.setNom("RAVANDOUST");
	
	pers2.setPrenom("Hajar");
	pers2.setNom("RAVANDOUST");
	pers2.surnom = "Khaled";
	
	persTab[0] = pers1;
	persTab[1] = pers2;
	
	//Parcours du tableau
	for (Personne p : persTab)
		p.afficherDetails();
		
	

	}

}
