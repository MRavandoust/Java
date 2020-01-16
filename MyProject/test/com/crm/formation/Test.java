/**
 * 
 */
package com.crm.formation;

/**
 * @author CRM
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("\"" + "Hello World" + "\"");
		System.out.println("\"" + "Comment ça va ?" + "\"");
		
		int maVariableInt = 2;
//		maVariableInt = 2;
		maVariableInt *=5;
		
		System.out.println(maVariableInt);
		
		maVariableInt = 6;
		System.out.println(maVariableInt);
		int xXX = 357;
		
		{
		byte maVariableByte = 55; 
		System.out.println(maVariableByte);
		short maVariableShort = 5555; 
		System.out.println(maVariableShort);
		int maVariableInt1 = 1000000000; 
		System.out.println(maVariableInt1);
		long maVariableLong = 1000000000222222222L;
		System.out.println(maVariableLong);
		
		System.out.println(xXX);
		}
		
		short maVariableShort = 25;
		System.out.println(maVariableShort);
		
		
//		float maVariableFloat = 2.5F; // il faut mettre F après 2.5
//		double maVariableDouble = 3.456885; 
//		char maVariableChar = 'c';
		char maVariableChar1 = '\u0059';
		System.out.println(maVariableChar1);
		
//		boolean maVariableBoolean = true;
		
		String maChaine1 = "Mon texte";
		String maChaine2 = " est super";
		
		System.out.println(maChaine1 + " " + maVariableInt + maChaine2 );
		
		
	}

}
