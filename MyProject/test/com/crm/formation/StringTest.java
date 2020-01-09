/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * @author CRM
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texte= "Bonjour" ;
		System.out.println(texte);
		
		texte = "   Au revoir";
		System.out.println(texte);
		
		// Test de concanétation
		System.out.println("La dernière fois vous avez dit : " + texte);
		
		System.out.println(texte.length());  // La langueur d'une chaine 
		
		String s = texte.toUpperCase();
		System.out.println(s);
		
		String s1 = s.trim();
		System.out.println(s1);
		
		String s0 = "Bonjour tout le monde";
		String s2 = texte.replaceAll(texte, s0);
		System.out.println(s2);
		
		
		String s3 = s.replace('A', 'b');
		System.out.println(s3);
		
		String s4 = s2.substring(5);
		System.out.println(s4);
		
		
		String s5 = s2.substring(2 , 5);
		System.out.println(s5);
		
		

	}

}
