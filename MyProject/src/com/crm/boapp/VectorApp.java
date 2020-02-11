/**
 * 
 */
package com.crm.boapp;

import java.util.Vector;

import com.crm.bo.Personne;


/**
* @author Masoud RAVANDOUST
*/


public class VectorApp {


	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Vector groupe = new Vector();
		Personne michael = new Personne("Michael" , "Jordan");
		Personne lebron = new Personne("Lebron" , "James");
		
		groupe.addElement(michael);
		groupe.addElement(lebron);
		
		Personne unBasketteur1 = (Personne) groupe.get(0);
		System.out.println(unBasketteur1.getNom());
		
		System.out.println("Mon equipe a " + groupe.size() + " joueurs");
		
		Personne kob = new Personne("Kobe" , "Bryant");
		groupe.addElement(kob);
		
		System.out.println("Mon equipe a " + groupe.size() + " joueurs");
		
		System.out.println("Le joueur Lebron James est à la " + (groupe.indexOf(lebron) + 1) + "position");
		
		lebron.surnom = "The king";
		
		Personne lebronModif = (Personne) groupe.get(1);
		System.out.println("Le surnom de Lebron James est " + lebronModif.surnom);
		
		
		((Personne)groupe.get(0)).afficherDetails();
		
		
	

	}

}
