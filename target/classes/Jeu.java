import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Jeu extends Liste{
	
	public static void modeJoueur() {
		
		for (int u = 0; u < 10; u++) {
			Liste Joueur = new Liste();
			
			Liste Ordi = new Liste();
			ordi = Ordi.getOrdi();
			
			int val1 = (int) ordi.get(0);
		    int val2 = (int) ordi.get(1);
		    int val3 = (int) ordi.get(2);
		    int val4 = (int) ordi.get(3);
			
		    String nombreOrdi = Arrays.toString(ordi.toArray()).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
		    
			while (ordi != utilisateur) { 
				
				for (int x = 1 ; x < 11; x ++) {
					
					System.out.println("Essai n°" + x + " :");
					
					utilisateur = Joueur.getUtilisateur();			    	
			        
					int util1 = (int) utilisateur.get(0);
			        int util2 = (int) utilisateur.get(1);
			        int util3 = (int) utilisateur.get(2);
			        int util4 = (int) utilisateur.get(3);			        		        	    
				    
			        String nombreUtil = Arrays.toString(utilisateur.toArray()).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
			       	//1
			       	if (util1 > val1) {
			       		reponse.add("-");
			       	}
			       	if (util1 < val1) {
			       		reponse.add("+");
			       	}
			       	if (util1 == val1) {
			       		reponse.add("=");
			       	}
			       	
			       	//2
			       	if (util2 > val2) {
			       		reponse.add("-");
			       	}
			       	if (util2 < val2) {
			       		reponse.add("+");
			       	}
			       	if (util2 == val2) {
			       		reponse.add("=");
			       	}
			       	
			       	//3
			       	if (util3 > val3) {
			       		reponse.add("-");
			       	}
			       	if (util3 < val3) {
			       		reponse.add("+");
			       	}
			       	if (util3 == val3) {
			       		reponse.add("=");
			       	}
			       	
			       	//4
			       	if (util4 > val4) {
			       		reponse.add("-");
			       	}
			       	if (util4 < val4) {
			       		reponse.add("+");
			       	}
			       	if (util4 == val4) {
			       		reponse.add("=");
			       	}
			       	
			        if (x == 10) {
				       	System.out.println("Aucune tentative restante.");
				       	System.out.println("La réponse était : " + nombreOrdi);
				    }
			     		       	
			       	if (ordi.equals(utilisateur)){
			       		System.out.println("Bien joué, vous avez trouvé le nombre mystère !");
			       		return;
			       	}
			       	
			       	String listReponse = Arrays.toString(reponse.toArray()).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
			       	
			       	System.out.println("\nVotre nombre : " + nombreUtil);
		        	System.out.println("Réponse : " + listReponse + "\n");
		        	
		        	reponse.clear();
			       	utilisateur.clear();    	
			       	
				} 
				
			}
		}
	}

	
	public void modeOrdi() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Le nombre à faire deviner : ");			
		
		Liste Joueur = new Liste();
		utilisateur = Joueur.getUtilisateur();
		
		int util1 = (int) utilisateur.get(0);
	    int util2 = (int) utilisateur.get(1);
	    int util3 = (int) utilisateur.get(2);
	    int util4 = (int) utilisateur.get(3);
	    
	    String nombreUtil = Arrays.toString(utilisateur.toArray()).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
	    
	    
		Liste Ordi = new Liste();	
		ordi = Ordi.getOrdi();
		
		int nbrPrec1 = 0;
	 	int nbrPrec2 = 0;
	 	int nbrPrec3 = 0;
	 	int nbrPrec4 = 0;
	 		 		 	
	 	List<String> reponse = new ArrayList<>();
		
	 	while (ordi != utilisateur) { 
	 		for (int x = 1 ; x < 12; x ++) {
			        
	 			int val1 = (int) ordi.get(0);
				int val2 = (int) ordi.get(1);
				int val3 = (int) ordi.get(2);
				int val4 = (int) ordi.get(3);
				  
				String nombreOrdi = Arrays.toString(ordi.toArray()).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");			    
				    
				System.out.println("Votre nombre aléatoire : " + nombreUtil);
				   
			    System.out.println("Nombre de l'ordi : " + nombreOrdi);
			        
			        
			    //1
			    if (util1 < val1) {
			    	reponse.add("-");
			    }
			    if (util1 > val1) {
			       	reponse.add("+");
			    }
			    if (util1 == val1) {
			       	reponse.add("=");
			    }
			       	
			    //2
			    if (util2 < val2) {
			       	reponse.add("-");
			    }
			    if (util2 > val2) {
			       	reponse.add("+");
			    }
			    if (util2 == val2) {
			       	reponse.add("=");
			    }
			       	
			    //3
			    if (util3 < val3) {
			       	reponse.add("-");
			    }
			    if (util3 > val3) {
			    	reponse.add("+");
			    }
			    if (util3 == val3) {
			       	reponse.add("=");
			    }
			       	
			    //4
			    if (util4 < val4) {
			       	reponse.add("-");
			    }
			    if (util4 > val4) {
			       	reponse.add("+");
			    }
			    if (util4 == val4) {
			       	reponse.add("=");
			    }
			     		       	
			    if (utilisateur.equals(ordi)){
			       	System.out.println("L'ordi a trouvé le nombre mystère !");
			       	return;
			    }
			       	
			    if (x == 10) {
			       	System.out.println("L'ordi n'a pas trouvé votre nombre mystère !");
			       	return;
			    }
			    	
			    if (x==1) {
			    	System.out.println(x + "ère tentative de l'ordinateur :");
			    }
			       	
			    if (x > 1) {
			       	System.out.println(x + "ème tentative de l'ordinateur :");
			    }
			       	
			    String listReponse = Arrays.toString(reponse.toArray()).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
			    System.out.println("Réponse : " + listReponse);
		        	
			    String c;
		        System.out.println("Réponse suivante...");
		        c = scanner.nextLine();
		        	
		        	
			    if (util1 < val1) {
			        nbrPrec1 = randInt(0, val1);
				}
				if (util1 > val1) {
				    nbrPrec1 = randInt(val1 + 1, 9);
				}
				if (util1 == val1) {
					nbrPrec1 = util1;
				}
				       	
				       	
			    if (util2 < val2) {
			        		nbrPrec2 = randInt(0, val2);
				}
				if (util2 > val2) {
				       		nbrPrec2 = randInt(val2 + 1, 9);
				}
				if (util2 == val2) {
				    nbrPrec2 = util2;
				}
				       	
				       							      
			    if (util3 < val3) {
			        nbrPrec3 = randInt(0, val3);
				}
				if (util3 > val3) {
					nbrPrec3 = randInt(val3 + 1, 9);
				}
				if (util3 == val3) {
					nbrPrec3 = util1;
				}
				       	
				       	
			    if (util4 < val4) {
			        nbrPrec4 = randInt(0, val4);
				}
				if (util4 > val4) {
				       	nbrPrec4 = randInt(val3 + 1, 9);
				}
				if (util4 == val4) {
				       	nbrPrec4 = util4;
				}       	
		        reponse.clear();
		        ordi.clear();
	 	
		        ordi.add(nbrPrec1);
		        ordi.add(nbrPrec2);
		        ordi.add(nbrPrec3);
		        ordi.add(nbrPrec4);	       	
			} 
		}
	}

	//PERMET DE CHOISIR UN NBR RANDOM AVEC UNE RANGE
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
	    return randomNum;
	}
	
}
