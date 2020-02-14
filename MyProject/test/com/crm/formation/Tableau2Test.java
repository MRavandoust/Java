/**
 * 
 */
package com.crm.formation;

/**
* @author Masoud RAVANDOUST
*/

/**
 * @author CRM
 *
 */
public class Tableau2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclaration d'un tableau à 2 dimention
		int[][] tab2d = new int[2][3];
		int[][] tab3d = new int[4][5];
		for(int i = 0; i< tab3d.length; i++)
			for(int j =0; j<tab3d[i].length; j++)
				tab3d[i][j] = i*j;
		
		for(int i = 0; i< tab3d.length; i++){
			System.out.println();
			for(int j =0; j<tab3d[i].length; j++) { 
				System.out.print(tab3d[i][j] + " ");
			}
			}
		System.out.println("\n\n");

		// Déclaration avec init
		int[][] tab2dim = { { 1, 2, 3 }, { 0, 2, 4 }, { 2, 6, 9, 8 }, { 5, 9, 3, 4, 7, 2, 0, 1, 5, }, { 7, 6, 1, 0 } };

		// Accés aus éléments
		System.out.println("élément[0][0] : " + tab2dim[0][0]);
		System.out.println("élément[1][2] : " + tab2dim[1][2]);

		// Modification d'un éléments
		tab2dim[1][2] = 6;
		System.out.format("élément[1][2] : %d" , tab2dim[1][2]);
		
		System.out.println("\n");

		// Parcourir le tableau par une boucle for
		for (int i = 0; i < tab2dim.length; i++) {
			for (int j = 0; j < tab2dim[i].length; j++) {
				System.out.print(tab2dim[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\n");

		// Parcourir le tableau par une boucle for
		for (int i = 0; i < tab2dim.length; i++) {
			for (int j = 0; j < tab2dim[i].length; j++) {
				System.out.println("élément [" + i + "][" + j + "] :" + tab2dim[i][j] + " ");

			}
		}

	}

}
