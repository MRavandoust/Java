/**
 * 
 */
package com.crm.formation;

import java.util.Arrays;
import java.util.Scanner;

/**
* @author Masoud RAVANDOUST
*/

/**
 * @author CRM
 *
 */
public class TableauAuthentificationLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre vitre identification :");
		String id = sc.nextLine();
		System.out.println("Entre vitre mot de pass :");
		String mdp = sc.nextLine();

		authentification(id, mdp);
		sc.close();

	}

	public static void authentification(String id, String mdp) {
		String[][] log = { { "masoud", "Mas22" }, { "Ali", "Al33" }, { "Soma", "Som44" }, { "Soline, Sol55" },
				{ "Crm", "CR66" } };
		int n = -1;
		int m = -1;
		for (int i = 0; i < log.length; i++) {
			for (int j = 0; j < log[i].length; j++) {
				if (id.equalsIgnoreCase(log[i][0]) && mdp.equals(log[i][1])) {
					n = i;
					m = j;
				}
			}
		}
		if (n == -1 || m == -1)
			System.out.println("Echec de l'authentification");
		else
			System.out.println("Connexion réussie");
	}

}
