/**
 * 
 */
package com.crm.boapp;

import javax.sound.midi.Soundbank;

import com.crm.bo.FicheTechnique;
import com.crm.bo.Voiture;

/**
 * @author Masoud RAVANDOUST
 */

public class VoitureApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Voiture mercedese = new Voiture();
		FicheTechnique fiche1 = new FicheTechnique();
		
		fiche1.setBoiteAuto(false);
		fiche1.setMarque("Peugeot");
		
		mercedese.setFiche(fiche1);
		
		mercedese.getFiche().afficheProprietes();
		
		System.out.println();
		
		//La class par un constructeur avec parametres
		Voiture voi1 = new Voiture("Fiat", "vert", true , 5 , 8000);
		//voi1.getFiche().afficheProprietes();
		
		voi1.demarrer();
		if (voi1.isEtatActuel())
			System.out.println("La voiture demare");
		
		voi1.arrete();
		if (!voi1.isEtatActuel())
			System.out.println("La voiture arrete");
		
		voi1.afficheVitesse();
		
		voi1.demarrer();
		
		voi1.accelere("autoroute", 120);
		voi1.afficheVitesse();
		
		voi1.ralentir(80);
		voi1.afficheVitesse();


	}

}
