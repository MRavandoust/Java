/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class jeuDevineUnNombre {

	private static int nombre;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = (int) (Math.random() * 99 + 1);
		int y = 0;
		System.out.println("Entrez un nombre compris entre 0 et 100 :");
		do {
			nombre = sc.nextInt();
			y++;
			if (nombre < x)
				System.out.println("C'est moins");
			else if (nombre > x)
				System.out.println("C'est plus");
			else {
				System.out.println("Le nombre est bien " + x);
				System.out.format("Vous l'avez trouvé en %d essai", y);
			}
		} while (nombre != x);
		sc.close();
	}

}
