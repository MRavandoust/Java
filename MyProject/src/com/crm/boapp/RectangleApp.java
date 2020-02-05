/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Rectangle;

/**
* @author Masoud RAVANDOUST
*/

public class RectangleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez hauter :");
		float hauteur1 = sc.nextFloat();
		System.out.println("Entrez largeur :");
		float largeur1 = sc.nextFloat();
		rec1.setHauteur(hauteur1);
		rec1.setLargeur(largeur1);
		rec1.afficheDetails();
		sc.close();

		Rectangle rec2 = new Rectangle(12, 18);
		rec2.afficheDetails();
	}

}
