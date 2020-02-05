/**
 * 
 */
package com.crm.bo;

/**
 * @author Masoud RAVANDOUST
 */

public class CompteBancaire {
	private float solde;
	private int numeroCompte;

	public CompteBancaire() {
		solde = 0;
		numeroCompte = 0;
	}

	public CompteBancaire(int num, float s) {
		numeroCompte = num;
		solde = s;	
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public void retraitSolde(int montant) {
		if (montant > 150)
			System.out.println("Vous pouvez retirer maximum 150€");
		else
			solde -= montant;
		System.out.println("Votre solde actuel est " + solde);
	}

	public void depotSolde(int montant) {
		solde += montant;
		System.out.println("Votre solde actuel est " + solde);
	}
	
	public void afficherSolde() {
		System.out.println("Votre solde actuel est " + getSolde());
	}

}
