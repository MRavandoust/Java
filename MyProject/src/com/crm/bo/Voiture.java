/**
 * 
 */
package com.crm.bo;

/**
* @author Masoud RAVANDOUST
*/

public class Voiture {
	FicheTechnique fiche;
	private int vitesse;
	private String typeRoute;
	private boolean demaree;
	
	public Voiture() {
		
		vitesse = 0;
		demaree = false;
	}
	
	public Voiture(String marque, String couleur, int nbPortes, boolean boteAuto ) {
		
	}

	public String getMarque() {
		return fiche.marque;
	}

	public void setMarque(String marque) {
		fiche.marque = marque;
	}

	public String getCouleur() {
		return fiche.couleur;
	}

	public void setCouleur(String couleur) {
		fiche.couleur = couleur;
	}

	public int getNbPortes() {
		return fiche.nbPortes;
	}

	public void setNbPortes(int nbPortes) {
		fiche.nbPortes = nbPortes;
	}

	public boolean isBoiteAuto() {
		return fiche.boiteAuto;
	}

	public void setBoiteAuto(boolean boiteAuto) {
		fiche.boiteAuto = boiteAuto;
	}

	public int getPrix() {
		return fiche.prix;
	}

	public void setPrix(int prix) {
		fiche.prix = prix;
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
	
	public void afficheProprietes() {
		System.out.println("La marque: " + getMarque());
		System.out.println("Le couleur: " + getCouleur());
		System.out.println("Le nonmbre de portes: " + getNbPortes());
		if (fiche.boiteAuto = true)
			System.out.println("La boite de vitesse: Auto");
		else
			System.out.println("La boite de vitesse: Manuel");
		System.out.println("Le prix: " + getPrix() + "€");
		
	}

}
