/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class MaxNombre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez 1er nombre: ");
		double a = sc.nextDouble();
		System.out.println("Entrez 2e nombre: ");
		double b = sc.nextDouble();
		System.out.println("Entrez 3e nombre: ");
		double c = sc.nextDouble();
		// Première solution
//		double max1 = Math.max(a, b);
//		double max2 = Math.max(max1, c);

		// Deuxieme solution
		double max1 = (a > b) ? a : b;
		double max2 = (max1 > c) ? max1 : c;

		// Troisieme solution
//		double max1 , max2;
//		if (a > b) {
//			 max1 = a;
//		}else {
//			 max1 = b;
//		}
//		if (max1 > c) {
//			 max2 = max1;
//		}else {
//			max2 = c;
//		}

		System.out.format("Le nombre maximum est : %.2f", max2);

		sc.close();
	}

}
