/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class DessinerRectangleLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une longueur du triangle :");
		int k = sc.nextInt();
		int i;

		for (i = 0; i <= k; i++)
			System.out.print("__");
		System.out.print("\n");
		for (int m = 0; m < k - 2; m++) {
			System.out.print("|");
			for (int l = 0; l < k; l++)
				System.out.print("  ");
			System.out.print("|");
			System.out.print("\n");
		}

		for (i = 0; i <= k; i++)
			System.out.print("__");
		sc.close();
	}

}
