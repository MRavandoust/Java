/**
 * 
 */
package com.crm.boapp;

import java.util.Scanner;

import com.crm.bo.Rectangle;

/**
* @author Masoud RAVANDOUST
*/

/**
 * @author CRM
 *
 */
public class RectangleTabApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle[] recTab = new Rectangle[2];

		Rectangle rec1 = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez hauter :");
		float hauteur1 = sc.nextFloat();
		System.out.println("Entrez largeur :");
		float largeur1 = sc.nextFloat();
		rec1.setHauteur(hauteur1);
		rec1.setLargeur(largeur1);

		Rectangle rec2 = new Rectangle();
		System.out.println("Entrez hauter :");
		float hauteur2 = sc.nextFloat();
		System.out.println("Entrez largeur :");
		float largeur2 = sc.nextFloat();
		rec2.setHauteur(hauteur2);
		rec2.setLargeur(largeur2);

		recTab[0] = rec1;
		recTab[1] = rec2;

		for (Rectangle r : recTab) {
			r.afficheDetails();
			System.out.println();
		}
		
		rec1.comparRec(rec2);
		
		
		sc.close();

	}

}
