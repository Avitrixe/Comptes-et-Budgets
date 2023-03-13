package boundary;

import java.awt.Choice;
import java.util.Scanner;

public class BoundaryAccederCompte {
	
	private BoundaryAccederMois boundaryAccederMois;
	private BoundaryAjouterMois boundaryAjouterMois;
	private BoundaryAfficherInfosCompte boundaryAfficherInfosCompte;
	
	private ControlAccederCompte controlAccederCompte;
	
	private Scanner scan = new Scanner(System.in);
	
	public BoundaryAccederCompte(ControlAccederCompte controlAccederCompte, BoundaryAccederMois boundaryAccederMois, BoundaryAjouterMois boundaryAjouterMois, BoundaryAfficherInfosCompte boundaryAfficherInfosCompte) {
		this.controlAccederCompte = controlAccederCompte;
		this.boundaryAccederMois = boundaryAccederMois;
		this.boundaryAfficherInfosCompte = boundaryAfficherInfosCompte;
		this.boundaryAjouterMois = boundaryAjouterMois;
	}
	
	public void accederCompte(String nom) {
		boolean nomClientConnu = controlAccederCompte.verifierIdentite(nom);
		if (!nomClientConnu) {
			System.out.println("Désolé, " + nom + " mais il faut être inscrit sur l'application pour l'utiliser.");
		}
		else {
			String nomCompte;
			System.out.println("A quelle compte voulez-vous acceder ?\n");
			nomCompte = scan.next();
			
			boolean compteExiste = controlAccederCompte.verifierCompte(nom, nomComtpe);
			if (!compteExiste) {
				System.out.println("L'accès à ce compte est impossible car il n'existe pas\n");
			}
			else {
				int choix_utilisateur;
				do {
					System.out.println("Que voulez-vous effectuer avec ce compte ?\n");
					StringBuilder question = new StringBuilder();
					question.append("1 - Acceder à un Mois\n");
					question.append("2 - Ajouter un Mois\n");
					question.append("3 - Avoir une vu d'ensemble du compte\n");
					question.append("4 - Quitter cette fenêtre\n");
					
					choix_utilisateur = Clavier.entrerEntier(question.toString());
					switch (choix_utilisateur) {
					case 1 :
						boundaryAccederMois.accederMois();
						break;
					case 2 :
						boundaryAjouterMois.ajouterMois();
						break;
					case 3 :
						boundaryAfficherInfosCompte.afficherInfosCompte(nomCompte, nom);
						break;
					case 4 :
						System.out.println("A +");
						break;
					default :
						System.out.println("Saisisser un nombre entre 1 et 4");
						break;
					}
					
				} while (choix_utilisateur != 5);
			}
		}
	}
}
