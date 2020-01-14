/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class ReductionBillet1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votr age? ");
		int age = sc.nextInt();
		if (age >= 25) {
			if (age >= 60) {
				System.out.println("Vous avez droit à une réduction de 30% .");
			} else {
				System.out.println("Aucune réduction");
			}
		} else {
			System.out.println("Vous avez droit à une réduction de 50% .");
		}

		sc.close();

	}

}
