/**
 * 
 */
package com.crm.formation;

import java.util.Scanner;

/**
 * 
 * @author CRM
 *
 */
public class LesChiffreEntreDeuxLimit {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre premier nombre: ");
		int n1 = sc.nextInt();
		System.out.println("Entre deuxième nombre: ");
		int n2 = sc.nextInt();
		System.out.println("Le valeurs intermédiaires :");

		//premier type repetative
//		for(int i=0; i < ((n2-n1)/2)+1; i++)
//			System.out.println(n1 + 2*i);
		
		 //deuxième type repetative
//		int i = 0;
//		while (i < ((n2-n1)/2)+1) {
//			System.out.println(n1 + 2*i);
//			i++;
//		}
		
		//troisième type repetative
		int i = 0;
		do {
			System.out.println(n1 + 2*i);
			i++;
		} while (i < ((n2-n1)/2)+1) ;
		
		sc.close();
	}

}
