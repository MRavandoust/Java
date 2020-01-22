/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class LoginForm {
	public static final String LOG = "CRM";
	public static final String PASS = "CDI1234";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre login : ");
		String login = sc.nextLine();
		System.out.println("Entrez votre mot de passe : ");
		String motDePasse = sc.nextLine();
		if (login.equalsIgnoreCase(LOG)) {
			if (motDePasse.equals(PASS)) {
				System.out.println("Login success");
			} else {
				System.out.println("Login failed!\nLe mot de passe est incorrect!.");
			}
		} else {
			System.out.println("Login failed!\nVotre login est incorrect");
		}
		sc.close();
		
	}

}
