
import java.util.Scanner;

/**
 * 
 */

/**
 * @author CRM
 *
 */
public class PerimetreDuRectangle {
	Scanner reader = new Scanner(System.in);

	public void calculePerimetr(double a, double b) {

		System.out.println("Entrez le premier chiffre :");

		a = reader.nextDouble();

		System.out.println("Entrez le deuxiem chiffre :");
		b = reader.nextDouble();

		double p = 2 * (a + b);

		System.out.println("Le périmère du rectangle est : " + p);

		reader.close();

	}

}
