/**
 * 
 */
package com.crm.bo;

import com.crm.bo.FicheTechnique;

/**
 * @author Masoud RAVANDOUST
 */

public class Voiture {
	public FicheTechnique fiche;
	private int vitesse;
	private String typeRoute;
	private boolean demaree;
	private boolean etatActuel;

	public Voiture() {
		fiche  = new FicheTechnique();
		vitesse = 0;
		demaree = false;
	}

	public Voiture(String marque, String couleur, boolean boiteAuto, int nbPortes, int prix) {
		fiche = new FicheTechnique(marque, couleur, boiteAuto, nbPortes, prix);
	}

	public FicheTechnique getFiche() {
		return fiche;
	}

	public void setFiche(FicheTechnique fiche) {
		this.fiche = fiche;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public String getTypeRoute() {
		return typeRoute;
	}

	public void setTypeRoute(String typeRoute) {
		this.typeRoute = typeRoute;
	}

	public boolean isDemaree() {
		return demaree;
	}

	public void setDemaree(boolean demaree) {
		this.demaree = demaree;
	}

	public boolean isEtatActuel() {
		return etatActuel;
	}

	public void setEtatActuel(boolean etatActuel) {
		this.etatActuel = etatActuel;
	}

	// Méthode pour demarrer la voiture

	public boolean demarrer() {
		if (etatActuel == false)
			etatActuel = true;
		return etatActuel;
	}

	// Méthode pour arreter la voiture

	public boolean arrete() {
		if (etatActuel == true)
			etatActuel = false;
		return etatActuel;
	}

	// Méthode pour afficher la vitesse de la voiture

	public void afficheVitesse() {
		System.out.println("La vitesse est: " + vitesse);
	}

	// Méthode pour accelerer la voiture

	public void accelere(String typeRoute, int vitesse) {
		if (etatActuel) {
			if (typeRoute.equalsIgnoreCase("ville")) {
				if (vitesse < 50)
					this.vitesse = vitesse;
				else
					System.out.println("La vitess maximum autorisé est 50 km/h");
			}

			else if (typeRoute.equalsIgnoreCase("national")) {
				if (vitesse < 80)
					this.vitesse = vitesse;
				else
					System.out.println("La vitess maximum autorisé est 80 km/h");
			} else if (typeRoute.equalsIgnoreCase("Autoroute")) {
				if (vitesse < 130 && vitesse > 60)
					this.vitesse = vitesse;
				else if (vitesse < 60)
					System.out.println("La vitess minimum autorisé est 60 km/h");
				else
					System.out.println("La vitess maximum autorisé est 130 km/h");
			}
		} else
			System.out.println("D'abord il faut demarrer la voiture");
	}

	// Méthode pour ralentir la voiture

	public void ralentir(int vitesse) {
		if (vitesse < this.vitesse)
			this.vitesse = vitesse;
		else
			vitesse = this.vitesse;
	}

}
