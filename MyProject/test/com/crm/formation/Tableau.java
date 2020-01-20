/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Tableau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] str = { "Bonjour ", "tout le monde! ", "la programation ", "est facile." };
		for (int i = 0; i < str.length; i++)
			System.out.print(str[i]);

		System.out.println();
		System.out.println();

		String[] jours = { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samdi", "dimanche" };
		String[] days = { "monday", "thuesday", "wednesday", "thursday", "friday", "saturday", "saunday" };
		for (int i = 0; i < jours.length; i++)
			System.out.format("Le \"%s\" en français est \"%s\" en englais\n", jours[i], days[i]);

		System.out.println();
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le jour :");
		String jour = sc.nextLine();
		// System.out.println(jour + " en anglais est: " + convertirJours(jour));

		System.out.println(convertirJours(jour));
		
		sc.close();
	}

	
	
	//La méthod de chercher l'indice
	public static int getIndice(String jour) {
		String[] jours = { "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samdi", "dimanche" };
		int n = -1;
		for (int i = 0; i < jours.length; i++) {
			if (jour.equalsIgnoreCase(jours[i])) {
				n = i;
			}
		}
		return n;
	}

	//la méthod de convertir un jour en anglais
	public static String convertirJours(String jour) {
		String[] days = { "monday", "thuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
		int indiceRecherche = Tableau.getIndice(jour);
		String message = "";
		if (indiceRecherche != -1) {
			message = jour + " en anglais est: " + days[getIndice(jour)];
		} else {
			message = "Le texte saisi n'est pas un jour";
		}
		return message;
	}

}
