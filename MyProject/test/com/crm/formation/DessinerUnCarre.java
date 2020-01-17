/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class DessinerUnCarre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une longueur du triangle :");
		int k = sc.nextInt();
		int i;
		int j;
		for (i = 0; i < k; i++) {
			for (j = 0; j < k; j++) {
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
