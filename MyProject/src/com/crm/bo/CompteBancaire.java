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
<<<<<<< HEAD
		if (montant > 150)
			System.out.println("Vous pouvez retirer maximum 150�");
		else
=======
		if (getSolde() - montant > -150)
>>>>>>> branch 'master' of https://github.com/Masoud2020/Java.git
			solde -= montant;
		else
		System.out.println("Votre pouvez retirer maximum :" + (solde + 150) + "€");
	}

	public void depotSolde(int montant) {
		solde += montant;
		System.out.println("Votre avez versé " + montant + "€"+ " avec succés et maintenat vous avez " + solde +"€");
	}
	
	public void afficherSolde() {
		System.out.println("Votre solde actuel est " + getSolde());
	}

}
