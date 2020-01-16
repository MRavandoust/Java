/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Swith1Constantes {
	public static final int A = 1, B = 2, C = 3, D = 4, E = 5, F = 6, G = 7, H = 8, I = 9;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un chiffre SVP :");
		int chiffre = sc.nextInt();

		switch (chiffre) {
		case A:
			System.out.println("Vous avez saisi 1 ");
			break;
		case B:
			System.out.println("Vous avez saisi 2 ");
			break;
		case C:
			System.out.println("Vous avez saisi 3 ");
			break;
		case D:
			System.out.println("Vous avez saisi 4 ");
			break;
		case E:
			System.out.println("Vous avez saisi 5 ");
			break;
		case F:
			System.out.println("Vous avez saisi 6 ");
			break;
		case G:
			System.out.println("Vous avez saisi 7 ");
			break;
		case H:
			System.out.println("Vous avez saisi 8 ");
			break;
		case I:
			System.out.println("Vous avez saisi 9 ");
			break;
		default:
			System.out.println("Vous n'avez pas saisi un chiffre. ");
			break;
		}
		sc.close();

	}

}
