/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class InstructionReturnTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		afficherListNombres(10);

	}
	
	public static void afficherListNombres(int nb) {
		System.out.println("Début méthode afficherListeNombres");
		
		for (int i = 0; i < nb; i++) {
			if(i==5) {
				return;  // il sort du programme
				//continue;  // il execute jusqu'à la fin sauf le cas excepté
				//break;  // il sort que la boucle for
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fin méthode afficherListeNombres");
	}

}
