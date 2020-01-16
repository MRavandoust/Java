/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class CalculePerimetr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x = 15, y = 32;
		double p1 = CalculezPerimetr(x, y);
		System.out.println("Le périmètre du rectangle est : " + p1);

		double a = 20;
		double b = 33;
		double c = CalculePerimetr.CalculezPerimetr(a, b);
		System.out.println("Le périmètre du rectangle est : " + c);

	}

	public static double CalculezPerimetr(double a, double b){
		double p = 2 * (a + b);
		return p;

	}

}
