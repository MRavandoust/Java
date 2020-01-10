
/**
 * 
 */
import java.util.*;

/**
 * @author CRM
 *
 */
public class GenerateurIdentiants {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entrer votre prénom : ");
		String prenom = sc.nextLine();
		System.out.println("Entrer votre nom : ");
		String nom = sc.nextLine();
		String login = (prenom.substring(0, 1)).toUpperCase() + "." + nom.toUpperCase();
		System.out.println("Votre login sera : " + login);
		String motDePasse = (nom.substring(0, 2).toUpperCase()) + "@" + prenom.substring(3) + (int) (Math.random() * 9);
		System.out.println("Votre mot de passe sera : " + motDePasse);
		sc.close();

	}

}
