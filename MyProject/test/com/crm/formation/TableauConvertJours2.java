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
public class TableauConvertJours2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le jour :");
		String jour = sc.nextLine();
		System.out.println(convertirJours2(jour));

		sc.close();
	}

	// La méthod de chercher l'indice
//	public static int[] getIndice(String jour) {
//		String[][] jours = { { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samdi", "dimanche" },
//				{ "monday", "thuesday", "wednesday", "thursday", "friday", "saturday", "sunday" } };
//		int n = -1;
//		int m = -1;
//		for (int i = 0; i < jours.length; i++) {
//			for (int j = 0; j < jours[i].length; j++)
//				if (jour.equalsIgnoreCase(jours[i][j])) {
//					n = i;
//					m = j;
//				}
//		}
//		int[] indice = {n , m};
//		return indice;
//	}

	// la méthod de convertir un jour en anglais
	public static String convertirJours2(String jour) {
		String[][] days = { { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samdi", "dimanche" },
				{ "monday", "thuesday", "wednesday", "thursday", "friday", "saturday", "sunday" } };
//		String[] indice = getIndice(jour).split(",");
//		int[] ind = {Integer.parseInt(indice[0]), Integer.parseInt(indice[1])};

		int n = -1;
		int m = -1;
		for (int i = 0; i < days.length; i++) {
			for (int j = 0; j < days[i].length; j++)
				if (jour.equalsIgnoreCase(days[i][j])) {
					n = i;
					m = j;
				}
		}
		int[] indice = { n, m };

		String message = "";
		int[] erreur = { -1, -1 };
		if (Arrays.equals(indice, erreur)) {
			message = " Le saisit n'est pas correct ";
		} else if (indice[0] == 0) {
			message = jour + " en anglais est: " + days[1][indice[1]];
		} else {
			message = jour + " en francais est: " + days[0][indice[1]];
		}
		return message;
	}

}
