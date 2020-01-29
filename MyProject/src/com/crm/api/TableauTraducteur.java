/**
 * 
 */
package com.crm.api;

import java.util.Scanner;

/**
 * @author Masoud RAVANDOUST
 */

public class TableauTraducteur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la phrase à traduire");
		String phrase = sc.nextLine();
		System.out.println("La traduction :");
		System.out.println(traducteur(phrase));
		sc.close();

	}

	public static String traducteur(String str) {
		// La base des donnees qui est un tableau a deux dimention
		String[][] dictionaire = { { "I", "je" }, { "am", "suis" }, { "are", "etes" }, { "student", "etudiant" },
				{ "programing", "programation" }, { "easy", "facile" }, { "hello", "bonjour" }, { "is", "est" },
				{ "today", "aujourd'hui" }, { "monday", "lundi" }, { "thuesday", "mardi" }, { "wednesday", "mercredi" },
				{ "thursday", "jeudi" }, { "friday", "vendredi" }, { "saturday", "samdi" }, { "sunday", "dimanche" },
				{ "you", "vous" }, { "we", "nous" }, { "and", "et" }, { "can", "pouvez" }, { "this", "cet" },
				{ "first", "premier" }, { "my", "mon" }, { "program", "programme" }, { "this's", "c'est" },
				{ "word", "mot" }, { "do", "faire" }, { "in", "en" }, { "Java", " Java" } };
		// On spilt les mots de phrase et on les verse dans tableau "phrase"
		String[] phrase = str.split(" ");
		String traduction = "";
		// parcourir le tableau dictionaire et coparer les elements avec chaque element
		// de phrase saisit
		for (int i = 0; i < phrase.length; i++) {
			for (int j = 0; j < dictionaire.length; j++) {
				for (int k = 0; k < dictionaire[j].length; k++) {
					if (phrase[i].equalsIgnoreCase(dictionaire[j][k])) {
						if (k == 0) {
							traduction += (dictionaire[j][1] + " ");
						} else
							traduction += (dictionaire[j][0] + " ");
					}
				}
			}
		}

		return traduction;

	}

}
