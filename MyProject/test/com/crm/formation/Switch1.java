/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Switch1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un chiffre SVP :");
		int chiffre = sc.nextInt();

		switch (chiffre) {
		case 1 :
			System.out.println("Vous avez saisi 1 ");
			break;
		case 2 :
			System.out.println("Vous avez saisi 2 ");
			break;
		case 3 :
			System.out.println("Vous avez saisi 3 ");
			break;
		case 4 :
			System.out.println("Vous avez saisi 4 ");
			break;
		case 5 :
			System.out.println("Vous avez saisi 5 ");
			break;
		case 6 :
			System.out.println("Vous avez saisi 6 ");
			break;
		case 7 :
			System.out.println("Vous avez saisi 7 ");
			break;
		case 8 :
			System.out.println("Vous avez saisi 8 ");
			break;
		case 9 :
			System.out.println("Vous avez saisi 9 ");
			break;
		default :
			System.out.println("Vous n'avez pas saisi un chiffre. ");
			break;
		}
		
		sc.close();
		

	}

}
