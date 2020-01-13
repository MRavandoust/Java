/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class ResultatExamen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre note :");
		double note = sc.nextDouble();
		if(note > 20) {
			System.out.println("Ce n'est pas possible. Entrez une bonne note SVP.");
		} else if(note >= 17) {
				System.out.println("Vous êtes reçu à l'examen avec mention TB!");
		}else if(note >= 14 && note < 17) {
			System.out.println("Vous êtes reçu à l'examen avec mention B!");
		}else if(note >= 10 && note < 14) {
			System.out.println("Vous êtes reçu à l'examen avec mention AB! ");
		}else if(note < 10 && note >= 0 ) {
			System.out.println("Vous devez passer le rattrapage!");
		}else if(note < 0) {
			System.out.println("Ce n'est pas possible. Entrez une bonne note SVP.");
		}

	}

}
