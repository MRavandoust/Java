/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class ConvertionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 123456;
		long y = x;
		System.out.println(y);

		int z = (int) y;   //En cas normal, il n'accepte pas d'affecter un int dans un long donc il faut le forcer.
		System.out.println(z);
		
		short s = 32000; 
		int c = s; 
		System.out.println(c);
		
//		byte b;
//		b = (byte) c; // (b = c;) C'est impossible donc ile faut faire "type casting".
		
		
		long l1 = 123456789;
		long l2 = 123456788;
		
		float f1 = l1;    // Pour convertir en float ce n'est pas la peine de caster et ce fait automatiquement.
		float f2 = l2;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(l1 - l2);
		System.out.println(f1 - f2);
		
		float f3 = x; 
		System.out.println(f3);
		
		
	}

}
