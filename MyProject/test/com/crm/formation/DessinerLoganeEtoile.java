/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class DessinerLoganeEtoile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une longueur du Losange :");
		int k = sc.nextInt();
		int i;
		

		for (i = 0; i < k; i++) {
			for (int l = 0; l < k - i; l++)
				System.out.print("*");
			System.out.print("/");
			for (int f = 0; f < 2 * i; f++)
				System.out.print(" ");
			System.out.print("\\");
			for (int l = 0; l < k - i; l++)
				System.out.print("*");
			System.out.print("\n");
		}

		for (i = 0; i < k; i++) {
			for (int l = 0; l < i + 1; l++)
				System.out.print("*");
			System.out.print("\\");
			for (int n = 0; n < 2 * k - 2 * i - 2; n++)
				System.out.print(" ");
			System.out.print("/");
			for (int l = 0; l < i + 1; l++)
				System.out.print("*");
			System.out.print("\n");
		}

		for (i = 0; i < k; i++) {
			for (int l = 0; l < k - i; l++)
				System.out.print(" ");
			System.out.print("/");
			for (int f = 0; f < 2 * i; f++)
				System.out.print("*");
			System.out.print("\\");
			for (int l = 0; l < k - i; l++)
				System.out.print(" ");
			System.out.print("\n");
		}

		for (i = 0; i < k; i++) {
			for (int l = 0; l < i + 1; l++)
				System.out.print(" ");
			System.out.print("\\");
			for (int n = 0; n < 2 * k - 2 * i - 2; n++)
				System.out.print("*");
			System.out.print("/");
			for (int l = 0; l < i + 1; l++)
				System.out.print(" ");
			System.out.print("\n");
		}
		sc.close();
	}

}
