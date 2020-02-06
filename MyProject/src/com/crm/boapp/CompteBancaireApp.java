/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.CompteBancaire;

/**
 * @author Masoud RAVANDOUST
 */

public class CompteBancaireApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CompteBancaire per1 = new CompteBancaire();
		CompteBancaire per2 = new CompteBancaire();
		CompteBancaire per3 = new CompteBancaire("0000025" , 2526);

		per1.setSolde(1250);
		per1.afficherSolde();
		per1.depotSolde(450);
		per1.retraitSolde(1800);
		per1.afficherSolde();
		per1.creeCompte();
		per2.creeCompte();
		per3.afficherSolde();
	}

}
