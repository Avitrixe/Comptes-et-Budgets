package boundary;

import java.util.Scanner;

public class BoundarySupprimerMois {
	
	private ControlSupprimerMois controlSupprimerMois;
	
	private Scanner scan = new Scanner(System.in);
	
	public BoundarySupprimerMois(ControlSupprimerMois controlSupprimerMois) {
		this.controlSupprimerMois = controlSupprimerMois;
	}
	
	public void supprimerMois(String nomMois) {
		int choix_utilisateur;
		StringBuilder question = new StringBuilder();
		
		question.append("Etes vous certains de vouloir supprimer le mois " + nomMois + " ?\n");
		question.append("1 - oui\n");
		question.append("2 - non\n");
		
		choix_utilisateur = Clavier.entrerEntier(question.toString());
		
		while(choix_utilisateur != 1 || choix_utilisateur != 2) {
			choix_utilisateur = Clavier.entrerEntier("Veuillez saisir 1 ou 2");
		}
		switch (choix_utilisateur) {
		case 1 :
			controlSupprimerMois.supprimerMois();
			System.out.println("Le mois " + nomMois + " a bien été supprimé.");
			break;
		case 2 :
			System.out.println("Vous avez bien annulé la suppression du mois.");
			break;
		default :
			break;
		}	
	}

}
