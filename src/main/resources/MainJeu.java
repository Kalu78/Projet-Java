import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainJeu{
	
	public static void main(String[] args) {

		int choice = 0;
		
		do {			
		
			System.out.println("1. Deviner un nombre mystère");
			System.out.println("2. Faire deviner un nombre mystère");
			System.out.println("3. Quitter l'application");
			
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			
			Jeu jeu = new Jeu();
			
			switch (choice) {
			case 1:
				jeu.modeJoueur();
				break;
			case 2:
				jeu.modeOrdi();
				break;
			default :
				System.out.println("Merci de saisir une valeur entre 1 et 4.");
				break;
			}
			
		} while(choice != 3);
		
		System.out.println("Fin du programme");

	}
}




