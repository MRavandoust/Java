/**
 * 
 */
package com.crm.boapp;

import com.crm.bo.RepereOrth;

/**
* @author Masoud RAVANDOUST
*/

public class RepereOrthApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RepereOrth rep1 = new RepereOrth();
		RepereOrth rep2 = new RepereOrth(17 , 86);
		rep1.setX(45);
		rep1.setY(12);
		
		System.out.format("La distance est : %.2f" ,rep1.calculeDistance(rep2));
	}

}
