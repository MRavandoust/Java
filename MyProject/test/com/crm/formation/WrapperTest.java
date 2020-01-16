/**
 * 
 */
package com.crm.formation;



/**
 * @author CRM
 *
 */  
public class WrapperTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner reader = new Scanner(System.in);
//		
//		System.out.println("Entrez les informations :");
//		String s = reader.nextLine();
//		
//		
//		System.out.println("Convertir String to Int :");
//		int i = Integer.parseInt(s);
//		System.out.println("Le resultat en Int : " + i);

		
		int i;
		String s;
		s = "584d";
		
//		i = Integer.parseInt(s);
//		System.out.println(i);
		try {
			i = Integer.parseInt(s);
			System.out.println("La valeur int est : " + i);
		    } catch (Exception e) {
		      System.out.println("Il faut entrer que les chiffres !!!.");
		    }
		
//		try {
//			
//			// Les commandes qu'on s'attend les exécutent.
//			
//		} catch (Exception e) {
//			
//			// Les commandes alternatives 
//		}
		
		
	}

}
