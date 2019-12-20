/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class LectureClavierTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Tapper quelque chose : ");

		String str = reader.nextLine();
		System.out.println("Vous avez tappé : " + '\"' + str + '\"');
		reader.close();
	}

}
