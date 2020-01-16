/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class BoucleFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float i;
		for (i = -5; i <= 5; i++) {
			if (i == 0) {
				System.out.println("Divistion par 0");
				continue;
			}
			System.out.println( 1/i);
		}

	}

}
