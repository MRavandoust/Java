/**
 * 
 */
package com.crm.formation;
import java.util.*;
/**
 * @author CRM
 *
 */
public class NombrePair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre : ");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Ce nombre est pair");
		}else {
			System.out.println("Ce nombre est impair");
		}
		sc.close();

	}

}
