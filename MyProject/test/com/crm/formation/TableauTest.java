/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class TableauTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Déclaration de tableau
		int[] tablInt1 = new int[5];
		int tablInt2[] = new int[5];
		
		
		//Déclarer et initialiser un tableau
		int[] tabInt3 = {1, 2, 3, };
		
		// accéder à un élément dy tableau
		int premierElement = tabInt3[0];
		System.out.println(premierElement);
		
		
		int premierElement1 = tabInt3[1];
		System.out.println(premierElement1);
		
		int premierElement2 = tabInt3[2];
		System.out.println(premierElement2);
		
		//Indice dépasse la taille du tableau
		//int premierElement3 = tabInt3[3];
		
		//Modifier la valeur d'un élément du tableau
		tabInt3[0]=10;
		premierElement = tabInt3[0];
		System.out.format("premier élément est modifié à %d\n", premierElement);
		
		//Parcours du tableau 
		for(int i=0; i<tabInt3.length; i++)
			System.out.println(tabInt3[i]);
		
		//Afficher la taille du tableau
		
	System.out.println("La taille du tableau est: " + tabInt3.length);
	System.out.format("La taille du tableau est: %d\n" , tabInt3.length);
	
	
	//Parcours du tableau (2e version)
	System.out.println("Parcours du tableau (2e version)");
	for (int nb : tabInt3)
		System.out.println(nb);
		
//		int[] tab = new int[10];
//		tab[0] = 4;
//		tab[1] = 3;
//		tab[2] = 6;
//		tab[4] = 7;
		
//		for (int i = 0; i < 10; i++)
//			System.out.println(tab[i]);
		
//		int tab1[] =  {5, 6, 4, 6, 7, 6};
//		for (int i = 0; i < tab1.length; i++)
//			System.out.println(tab1[i]);
		
		int[][] tabEntiers = {{9, 7, 3, 4, 5, 6},
                {8, 5, 2, 4 , 9, 7},
                {4, 2, 3, 7, 8, 9}};
		
		
		for (int i = 0; i <3; i++) { 
			for (int j = 0; j <6; j++)
				System.out.print(tabEntiers[i][j] + " ");
		
		}
	}

}
