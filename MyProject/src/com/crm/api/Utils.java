/**
 * 
 */
package com.crm.api;

import java.io.Reader;
import java.util.*;

/**
 * @author CRM
 *
 */

public class Utils {

	public static final String COULEUR_BLEU = "Bleu"; // Declaration d'une constante COULEUR_BLEU
	public static final float PI = 3.14f; // Declaration d'une constante PI

	// La method CalculePerimetr

	public static double CalculePerimetr(double a, double b) {
		double p = 2 * (a + b);
		return p;
	}

	// La methos AfficherMessage

	public static void AfficherMessage(String texte) {
		System.out.println(texte);

	}

	// La method MoyenneDe2Nombres
	public static double Moyenne2Nombres(double a, double b) {
		double m = (a + b) / 2;
		return m;
	}

	// La method MoyenneDePlusieurNombres

	public static double MoyenneDePlusieurNombres() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Attention : des que vous entrez 0 vous aurez le resultat !");
		System.out.println("Entrez le premier chiffre :");
		double k = reader.nextDouble();
		double j = 1;
		int i = 0;
		while (j != 0) {
			System.out.println("Entrez un autre chiffre :");
			j = reader.nextDouble();
			k = k + j;
			i++;
		}
		reader.close();
		double m = k / i;
		return m;

	}

	// La method surfaceCercle

	public static float surfaceCercle(int rayon) {
//		final float PI = 3.14f;     //Declaration d'une constant PI
		float surface = PI * rayon * rayon;
		return surface;

	}

	public static double CalculeSurfaceSphere(double a) {
		double s = 4 * Math.PI * Math.pow(a, 2);
		return s;
	}

	public static double CalculeVolumeSphere(double a) {
		double v = (4 / 3) * Math.PI * Math.pow(a, 3);
		return v;
	}

	public static double SurfaceSecteurCirculaire(double a, double b) {
		double s = (Math.PI * Math.pow(a, 2) * b) / 360;
		return s;
	}

}
