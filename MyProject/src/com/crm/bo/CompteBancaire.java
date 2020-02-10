/**
 * 
 */
package com.crm.bo;

/**
 * @author Masoud RAVANDOUST
 */

public class CompteBancaire {
	private float solde;
	private String numeroCompte;
	private static int nCompte = 0;

	public CompteBancaire() {
		solde = 0;
		numeroCompte = "";
	}

	public CompteBancaire(String num, float s) {
		numeroCompte = num;
		solde = s;	
	}
	
	public void creeCompte() {
		numeroCompte = String.format("%010d", (nCompte + 1));
		nCompte ++;
		System.out.println("Votre numero de compte est : " + numeroCompte);
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public void retraitSolde(int montant) {

		if (getSolde() - montant < - 150)
			System.out.println("Vous pouvez retirer maximum " + (getSolde() + 150) + "€" );
		else
			solde -= montant;
		System.out.println("Il vous rest " + getSolde() + "€ sur votre compte.");
	}

	public void depotSolde(int montant) {
		solde += montant;
		System.out.println("Votre avez versé " + montant + "€"+ " avec succés et maintenat vous avez " + solde +"€");
	}
	
	public void afficherSolde() {
		System.out.println("Votre solde actuel est " + getSolde() + "€");
	}

}
