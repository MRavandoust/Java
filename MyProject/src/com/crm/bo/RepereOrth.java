/**
 * 
 */
package com.crm.bo;

/**
* @author Masoud RAVANDOUST
*/

public class RepereOrth {
	
	private int x;
	private int y;
	
	public RepereOrth() {
		x = 0;
		y = 0;
	}
	
	public RepereOrth(int x , int y) {
		this.x = x;
		this.y = y;	
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double calculeDistance(RepereOrth rep) {
		return Math.sqrt((Math.pow((getX() - rep.getX()), 2)) + (Math.pow((getY() - rep.getY()), 2)) );
	}
	

}
