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
		per1.setSolde(1250);
		per1.afficherSolde();
		per1.depotSolde(450);
		per1.retraitSolde(145);
		

	}

}
