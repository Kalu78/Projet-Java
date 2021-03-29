import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Liste {
	
	protected static ArrayList<Integer> ordi;
	protected static ArrayList<Integer> utilisateur;
	protected static List<String> reponse = new ArrayList<>();
	
	protected ArrayList<Integer> getOrdi() {
		int chiffre;
		
	    for (int i = 0; i<4; i++)
	    {
	    	Random rand = new Random();
	        chiffre = rand.nextInt(9);
	        this.ordi.add(chiffre);
	    }
		return ordi;
	}
	
	protected ArrayList<Integer> getUtilisateur() {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0 ; i < 4 ; i++){
    		int a = i + 1;
    		int max = 9;
    		System.out.println("Chiffre n°" + a +" :");
    	    this.utilisateur.add(scanner.nextInt());
    	    if (this.utilisateur.get(i) > max) {
    	    	System.out.println("Veuillez tapper un chiffre entre 1 et 9");
    			Jeu.modeJoueur();
    		}
    	}
		return utilisateur;
	}
	
	
	
	protected Liste() {
		this.ordi = new ArrayList<Integer>();
		this.utilisateur = new ArrayList<Integer>();
	}
	
//PAS FONCTIONNEL
//	public String toString() {
//		String listOrdi = Arrays.toString(ordi.toArray()).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
//		return listOrdi;	
//	}
}
