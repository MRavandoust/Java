/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class Factorielle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre SVP : ");
		long nb = sc.nextLong();
		long resultat = factorielle(nb);
		System.out.println("Le resultat de factorielle est : " + resultat);
		sc.close();
	}
	
	
	public static long factorielle(long n) {
		
		if (n == 0)
			return 1;
		else
			return n*factorielle(n-1);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Entrez un nombre SVP : ");
//		long nb = sc.nextLong();
		//long resultat = 1L;
		//for (long i = 1L; i <= n; i++) {
			//resultat *= i;
//			System.out.println("i = " + i + " resultat = " + resultat);
//			if (resultat > Long.MAX_VALUE) {
//				System.out.println(">>>>>>>>>>>>>> Dépassement de la limite");
//			} 
		//}
		// System.out.println("MAX VALUE LONG = " + Long.MAX_VALUE);
		
		//return resultat;
	}

}
