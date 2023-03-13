package boundary;

import java.util.Scanner;

public class BoundaryCompte {
	
	private BoundaryAfficherCompte boundaryAfficherCompte;
	private BoundaryCreerCompte boundaryCreerCompte;
	private BoundaryAccederCompte boundaryAccederCompte;
	
	private Scanner scan = new Scanner(System.in);
	
	public BoundaryCompte(BoundaryAfficherCompte boundaryAfficherCompte, BoundaryCreerCompte boundaryCreerCompte, BoundaryAccederCompte boundaryAccederCompte) {
		this.boundaryAfficherCompte = boundaryAfficherCompte;
		this.boundaryAccederCompte = boundaryAccederCompte;
		this.boundaryCreerCompte = boundaryCreerCompte;
	}
	
	public void menu() {
		int choix_utilisateur;
		String nom = null;
		do {
			StringBuilder question = new StringBuilder();
			question.append("Qui êtes-vous ?\n");
			question.append("1 - Un nouvel utilisateur \n");
			question.append("2 - Un utilisateur ayant déjà au moins un compte \n");
			question.append("3 - Quitter l'application \n");
			choix_utilisateur = Clavier.entrerEntier(question.toString());
			if (choix_utilisateur > 0 && choix_utilisateur < 3) {
				System.out.println("Quelle est votre nom ?");
				nom = scan.next();
			}
			switch (choix_utilisateur) {
			case 1 :
				menuInscription(nom);
				break;
			case 2 :
				menuConnection(nom);
				break;
			default :
				System.out.println("Saisisser un nombre entre 1 et 3");
				break;
			}
		} while (choix_utilisateur != 3);
	}
	
	private void menuConnection(String nom) {
		int choix_utilisateur;
		do {
			StringBuilder question = new StringBuilder();
			question.append("1 - Afficher mes comptes \n");
			question.append("2 - Creer un nouveau Compte \n");
			question.append("3 - Acceder à un compte \n");
			question.append("4 - Quitter l'application \n");
			choix_utilisateur = Clavier.entrerEntier(question.toString());
			switch (choix_utilisateur) {
			case 1 :
				boundaryAfficherCompte.afficherCompte(nom);
				break;
			case 2 :
				boundaryCreerCompte.creerCompte(nom);
				break;  
			case 3 :
				boundaryAccederCompte.accederCompte(nom);
				break;
			case 4 :
				System.out.println("Au revoir " + nom);
				break;
			default :
				System.out.println("Vous devez entrer un chiffre entre 1 et 2");
				break;
			}
		} while (choix_utilisateur != 3);
	}
	
	private void menuInscription(String nom) {
		int choix_utilisateur;
		do {
			StringBuilder question = new StringBuilder();
			question.append("1 - Je crée un compte \n");
			question.append("2 - Quitter l'application \n");
			choix_utilisateur = Clavier.entrerEntier(question.toString());
			switch (choix_utilisateur) {
			case 1 :
				boundaryCreerCompte.creerCompte(nom);
				break;
			case 2 :
				System.out.println("Au revoir " + nom);
				break;
			default :
				System.out.println("Vous devez entrer un chiffre entre 1 et 2");
				break;
			}
			System.out.println();
		} while (choix_utilisateur != 2);
	}
}

	
