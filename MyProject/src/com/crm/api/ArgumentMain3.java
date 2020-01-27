/**
 * 
 */
package com.crm.api;


/**
* @author Masoud RAVANDOUST
* @version 2.3.2
* @since 2020
* @serial 27012020
 */
public class ArgumentMain3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] split1 = args[0].split("=");
		String[] split2 = args[1].split("=");
		String nom;
		String prenom;
		if (split1[0].equalsIgnoreCase("nom")) {
			nom = split1[1];
			prenom = split2[1];
		} else {
			prenom = split1[1];
			nom = split2[1];
		}

		System.out.println("Bonjour " + prenom + " " + nom);

	}

}
