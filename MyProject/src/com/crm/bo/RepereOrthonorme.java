/**
 * 
 */
package com.crm.bo;

/**
* @author Masoud RAVANDOUST
*/

public class RepereOrthonorme {
	private int[] pointA = new int[2];
	private int[] pointB = new int[2];
	
	public RepereOrthonorme() {
		pointA[0] = 0;
		pointA[1] = 0;
		pointB[0] = 0;
		pointB[1] = 0;
	}
	
	public RepereOrthonorme(int[] a, int[] b) {
		pointA[0] = a[0];
		pointA[1] = a[1];
		pointB[0] = b[0];
		pointB[1] = b[1];
	}

	public int[] getPointA() {
		return pointA;
	}

	public void setPointA(int[] a) {
		this.pointA[0] = a[0];
		this.pointA[1] = a[1];
	}

	public int[] getPointB() {
		return pointB;
	}

	public void setPointB(int[] b) {
		this.pointB[0] = b[0];
		this.pointB[1] = b[1];
	}
	
	
	public double calculeDistance() {
		return Math.sqrt(Math.pow((getPointA()[0] - getPointB()[0]), 2) + Math.pow((getPointA()[1] - getPointB()[1]), 2));
	}

}
