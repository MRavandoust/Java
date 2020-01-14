/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class SwitchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int choix = 45;
		switch (choix) {
		case 37:
			System.out.println("Café?");
			break;
		case 45:
			System.out.println("Thé?");
			break;
		case 55:
			System.out.println("Kola?");
			break;
		default:
			System.out.println("???");
			break;
		}
	}

}
