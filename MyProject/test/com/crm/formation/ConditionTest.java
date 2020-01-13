/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class ConditionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		boolean estVrai = true;
//		System.out.println("Début programme");
//		
//		if (estVrai == true) {
//			System.out.println("Le resultat est :");
//			System.out.println("YES");
//		} else {
//			System.out.println("NO");
//		System.out.println("WE CAN NOT");
//		}
//		
//		System.out.println("Fin programme");
		
		
		int nb = 5;
		String chaine = "OK";
		
					// syntaxe else if
		if (nb > 10 && chaine.equals("OK")) {
			System.out.println("Condition remplie");
		}else if(nb > 10 || chaine.equals("OK")) {
			System.out.println("Une des 2 condition remplie");
		}else {
			System.out.println("Aucune Condistion remplie");
		}
					
					//if imbriquée
		if (nb > 10 && chaine.equals("OK")) {
			System.out.println("Condition remplie");
		}else {
			if ((nb > 10 || chaine.equals("OK")))
				System.out.println("Une des 2 condition remplie");	
		}
	
	}
}
