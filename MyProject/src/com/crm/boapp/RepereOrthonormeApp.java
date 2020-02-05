/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.RepereOrthonorme;

/**
 * @author Masoud RAVANDOUST
 */

public class RepereOrthonormeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 25, 118 };
		int[] b = { 28, 48 };
		RepereOrthonorme rep = new RepereOrthonorme(a, b);
//		rep.setPointA(a);
//		rep.setPointB(b);
		System.out.format("La distance est : %.2f", rep.calculeDistance());

	}

}
