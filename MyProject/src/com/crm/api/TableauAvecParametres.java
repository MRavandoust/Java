package com.crm.api;

/**
 * 
 */

/**
* @author Masoud RAVANDOUST
*/
import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class TableauAvecParametres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau : ");
		int taill = sc.nextInt();
		int[] tab = new int[taill];
		for (int i = 0; i < taill; i++) {
			System.out.println("Entrez l'element " + (i + 1));
			tab[i] = sc.nextInt();
		}

		System.out.format("La somme des elements du tableau est le : %d", monTableau(tab));
sc.close();
	}

	
	public static int monTableau(int[] tab) {
		int somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		return somme;
	}
	
}
