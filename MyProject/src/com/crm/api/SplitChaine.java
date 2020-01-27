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
public class SplitChaine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strToSplit = "toto,titi,tata";
		String[] tabSplit = strToSplit.split(",");

		for (String str : tabSplit)
			System.out.println(str);

		for (String str : tabSplit)
			System.out.print(str + " ");

	}

}
