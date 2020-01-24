/**
 * 
 */
package com.crm.api;

/**
* @author Masoud RAVANDOUST
*/

/**
 * @author CRM
 *
 */
public class TableauEnParametre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		afficherTableau(tableau);
		
	}
		
	
	
	public static void afficherTableau(int[] tabInt) {
			for (int nb : tabInt) {
				System.out.println(nb);
			}
		}

	

}
