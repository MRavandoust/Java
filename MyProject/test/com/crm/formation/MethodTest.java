/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class MethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nb1 = 2;
		int nb2 = 3;
		int s1 = somme(nb1, nb2);
		System.out.println(s1);

		int nb3 = 7;
		int nb4 = 8;
		int s2 = MethodTest.somme(nb3, nb4);
		System.out.println(s2);

	}

	public static int somme(int a, int b) {
		int s = a + b;
		return s;
	}

}
