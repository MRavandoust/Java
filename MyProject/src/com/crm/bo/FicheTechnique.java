package com.crm.bo;

/**
 * @author Masoud RAVANDOUST
 */

public class FicheTechnique {
	private String marque;
	private String couleur;
	private int nbPortes;
	private boolean boiteAuto;
	private int prix;

	public FicheTechnique() {
		marque = "mercedese";
		couleur = "noir";
		nbPortes = 5;
		boiteAuto = true;
		prix = 9000;
	}
	public FicheTechnique(String marque, String couleur, boolean boiteAuto , int nbPortes , int prix) {
		this.marque = marque;
		this.couleur = couleur;
		this.boiteAuto = boiteAuto;
		this.nbPortes = nbPortes;
		this.prix = prix;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getNbPortes() {
		return nbPortes;
	}

	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}

	public boolean isBoiteAuto() {
		return boiteAuto;
	}

	public void setBoiteAuto(boolean boiteAuto) {
		this.boiteAuto = boiteAuto;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	// MÃ©thode pour afficher les proprietes de la voiture
	
	public void afficheProprietes() {
		System.out.println("La marque: " + getMarque());
		System.out.println("Le couleur: " + getCouleur());
		System.out.println("Le nonmbre de portes: " + getNbPortes());
		if (boiteAuto == true)
			System.out.println("La boite de vitesse: Auto");
		else
			System.out.println("La boite de vitesse: Manuel");
		System.out.println("Le prix: " + getPrix() + "€");

	}

	
	
}
