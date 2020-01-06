/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class OperateursTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int maVariableInt1;
		maVariableInt1 = 36;
		System.out.println(maVariableInt1);
		
		// Operateur d'assignement , d'affectation
		int maVariableInt2;
		maVariableInt2 = maVariableInt1;
		System.out.println(maVariableInt2);
		
		int maVariableInt3;
		maVariableInt3 = maVariableInt1 = maVariableInt2 = 58;
		System.out.println(maVariableInt1);
		System.out.println(maVariableInt2);
		System.out.println(maVariableInt3);
		
		System.out.format("Le resultat ets %d \n\n", maVariableInt1);
		
		
		int somme1;
		somme1 = 5 + 6;
		System.out.println("somme1 = " + somme1);
		
		int somme2;
		somme2 = somme1 + 7;
		System.out.println("somme2 = " + somme2);
		
		int sustraction;
		sustraction = somme2 - somme1;
		System.out.println("sustraction = " + sustraction);
	
		int produit;
		produit = sustraction * somme1;
		System.out.println("produit = " + produit);
	
		
		double division;
		division = (double)somme2 / 5;
		System.out.println("division = " + division);
		
		float division1;
		division1 = (float) somme2 / 5;
		System.out.println("division1 = " + division1);
		
		
		float division2 = 8f / 5;
		System.out.println("division2 = " + division2);
		
		double mod;
		mod = 9 % 4;
		System.out.println("Le rest est " + mod);
		
		

	}

}
