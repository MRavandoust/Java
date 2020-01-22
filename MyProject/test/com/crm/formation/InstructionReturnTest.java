/**
 *
 */
package com.crm.formation;

/**
  <b>English:</b>
 This program shows difference between instructions: return, break and continue.
 <br>
 
 <b>French:</b>
 Ce programme montre la difference entre les instructions: return, break and continue. 
 *
 * @author Masoud RAVANDOUST - CRM
 * @version 1.1.0
 *
 */
public class InstructionReturnTest {

	/**
	 * @param args args
	 */
	public static void main(String[] args) {
		afficherListNombres(10);

	}

	public static void afficherListNombres(int nb) {
		System.out.println("Début méthode afficherListeNombres");

		for (int i = 0; i < nb; i++) {
			if (i == 5) {
				return; // il sort du programme
				// continue; // il execute jusqu'à la fin sauf le cas excepté
				// break; // il sort que la boucle for
			}

			System.out.println(i);
		}

		System.out.println("Fin méthode afficherListeNombres");
	}

}
