/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class MotEstPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le mot :");
		String mot = sc.nextLine();
		String str = "";
		for (int i = 1; i <= mot.length(); i++) {
			char c = mot.charAt(mot.length() - i);
			str += c;
		}
		if (str.equals(mot)) {
			System.out.println("\"" + mot + "\"" + " est un palindrome.");
		} else
			System.out.println("\"" + mot + "\"" + " n'est pas un palindrome.");

		sc.close();

	}

}
