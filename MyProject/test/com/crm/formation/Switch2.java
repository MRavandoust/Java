/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Switch2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez une formation qualifiante parmi les propositions suivantes :");
		System.out.println("(C) : CDA\n(D) : DWWM\n(R) : Réorientation\n(E) : En cours de réflexion");
		String choix = sc.nextLine();

		switch (choix) {
		case "c":
			System.out.println("Vous avez choisi de suivre la formation Concepteur Développeur d'Applications ");
			break;
		case "C":
			System.out.println("Vous avez choisi de suivre la formation Concepteur Développeur d'Applications ");
			break;
		case "d":
			System.out.println("Vous avez choisi de suivre la formation Concepteur Développeur web");
			break;
		case "D":
			System.out.println("Vous avez choisi de suivre la formation Concepteur Développeur web");
			break;
		case "r":
			System.out.println("Vous avez choisi de suivre la formation Réoriantation");
			break;
		case "R":
			System.out.println("Vous avez choisi de suivre la formation Réoriantation");
			break;
		case "e":
			System.out.println("Vous avez choisi de suivre la formation en cours de réflexion");
			break;
		case "E":
			System.out.println("Vous avez choisi de suivre la formation en cours de réflexion");
			break;
		default:
			System.out.println("Vous n'avez pas choisi une formation. ");
			break;
		}

		sc.close();
	}

}
