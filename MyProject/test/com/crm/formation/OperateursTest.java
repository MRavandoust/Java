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
		System.out.println();
		
		System.out.println();
		
		// Opérateurs Incrémenter et Décrementer
		System.out.println("-------------------------------------");
		System.out.println("Opérateurs Incrémenter et Décrementer");
		System.out.println("-------------------------------------");
		
		
		int x1 = 15;
		int x2 = x1++;
		int x3 = ++x1;
		int x4 = ++x1;
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		System.out.println("x3 = " + x3);
		System.out.println("x4 = " + x4);
		
		System.out.println();
		
		// Opérateurs Relationnels
		System.out.println("-----------------------");
		System.out.println("Opérateurs Relationnels");
		System.out.println("-----------------------");
		
		
		int var1 = 7, var2 = 13;
		boolean res;
		res = (var1 == var2);
		System.out.println("res est " + res);
		res = (var2 > var1);
		System.out.println("res est " + res);
		res = (var1 != var2);
		System.out.println("res est " + res);
		
		
		System.out.println();
		
		// Opérateurs Logiques
		System.out.println("-------------------");
		System.out.println("Opérateurs Logiques");
		System.out.println("-------------------");
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = b1 || b2;
		boolean b4 = b1 && b2;
		boolean b5 = b1 ^ b2;
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " +b4);
		System.out.println("!b4 = " + !b4);
		System.out.println("b5 = OU exclisif = !b3 = " + b5);
		
		System.out.println();
		
		int v1 = 5, v2 = 9;
		int ress;
		ress = (v1 > v2)? v1 : v2;
		System.out.println(ress);
		int k = v1 & v2;
		System.out.println(k);
		
		System.out.println();
		
		// Opérateurs d'Assignements
		System.out.println("--------------------------");
		System.out.println("Opérateurs d'Assignements ");
		System.out.println("--------------------------");
		
		double total = 0 , num = 1;
		double pourcentage = 0.50;
		total = total + num;   		System.out.println(total);
		total += num;   			System.out.println(total);
		total -= num;  				System.out.println(total);
		total *= pourcentage;   	System.out.println(total);
		total /= 2;  				System.out.println(total);
		num %= pourcentage; 		System.out.println(num);
		
		
		
		
		
		

	}

}
