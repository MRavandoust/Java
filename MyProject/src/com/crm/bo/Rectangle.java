/**
 * 
 */
package com.crm.bo;

/**
* @author Masoud RAVANDOUST
*/

/**
 * @author CRM
 *
 */
public class Rectangle {
	
	private float hauteur;
	private float largeur;
	
	
	public Rectangle() {
		hauteur = 0;
		largeur = 0;
	}
	
	
	public Rectangle(float hauteur, float largeur) {
		this.hauteur = hauteur;
		this.largeur = largeur;
		
	}
	
	
	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}
	
	
	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}
	
	
	public float getHauteur() {
		return hauteur;
	}
	
	public float getLargeur() {
		return largeur;
	}
	
	public float calculePerimetre(float largeur, float hauteur) {
		return 2*(largeur + hauteur);
	}
	
	public float calculeSurface(float largeur, float hauteur) {
		return largeur*hauteur;
	}
	
	public void afficheDetails() {
		System.out.println("Details du Rectangle : ");
		System.out.println("Hauter : " + hauteur);
		System.out.println("Largeur : " + largeur);
		System.out.println("Périmère : " + calculePerimetre(getHauteur(), getLargeur()));
		System.out.println("Surface : " + calculeSurface(getHauteur(), getLargeur()));
	}
	
	/**
	 * Une methode pour comparer deux objets de la classe
	 * @param rec1
	 */
	public void comparRec(Rectangle rec1) {
		if (calculeSurface(getLargeur(), getHauteur()) < rec1.calculeSurface(rec1.getLargeur(), rec1.getHauteur()))
			System.out.println("Rectangle 2 est plus grande que Rectangle 1");
		else if (calculeSurface(getLargeur(), getHauteur()) > rec1.calculeSurface(rec1.getLargeur(), rec1.getHauteur()))
			System.out.println("Rectangle 1 est plus grande que Rectangle 2");
		else
			System.out.println("Les deux Rectangles sont égaux");
	}
	

}
