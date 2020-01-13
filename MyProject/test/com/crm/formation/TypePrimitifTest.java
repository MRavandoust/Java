/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class TypePrimitifTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long L = 156;
		short S = 12;
		
		long L1 = L + S ;
		System.out.println(L1);
		
		long L2 = L - S ;
		System.out.println(L2);
		
		short L3 = (short) (L / S) ;
		System.out.println(L3);
		
		
		
		int num1 = 15;
		int num2 = 28;
		int num;
		
		num = num1 + num2;
		System.out.println("Le resultat d'addistion est : " + num);
		
		num = num1 - num2;
		System.out.println("Le resultat de soustraction est : " + num);
		
		
		num = num1 * num2;
		System.out.println("Le resultat de multiplication est : " + num);
		
		float num3;
		num3 = (float)num2 / num1;
		System.out.println("Le resultat de division est : " + num3);
		
		num = num2 % num1;
		System.out.println("Le resultat de modulo est : " + num);
		
		
		char caractere = 'M';
		String str = " est une caractere";
		
		System.out.println("\"" + caractere + "\"" + str);
		
		System.out.println("\'" + caractere + "\'" + str); //???!!!
		
		boolean b = ((7 < 4) || (2 < 3));
		System.out.println(b);
		
		boolean b1 = ((2 < 3) && (6 < 3));
		System.out.println(b1);
		 
		
	}

}
