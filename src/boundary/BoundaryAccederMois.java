package boundary;

import java.util.Scanner;

public class BoundaryAccederMois {
	
	private BoundaryAccederPeriode boundaryAccederPeriode;
	private BoundaryAjouterPeriode boundaryAjouterPeriode;
	private BoundaryAfficherInfosMois boundaryAfficherInfosMois;
	
	private ControlAccederMois controlAccederMois;
	
	private Scanner scan = new Scanner(System.in);
	
	public BoundaryAfficherCompte(ControlAccederMois controlAccederMois, BoundaryAccederPeriode boundaryAccederPeriode, BoundaryAjouterPeriode boundaryAjouterPeriode, BoundaryAfficherInfosMois boundaryAfficherInfosMois) {
		this.boundaryAccederPeriode = boundaryAccederPeriode;
		this.boundaryAjouterPeriode = boundaryAjouterPeriode;
		this.boundaryAfficherInfosMois = boundaryAfficherInfosMois;
		this.controlAccederMois = controlAccederMois;
	}
	
	public void accederMois(String nomClient, String nomCompte) {
		String nomMois;
		System.out.println("A quelle compte voulez-vous acceder ?\n");
		nomMois = scan.next();
		
		boolean moisExiste = controlAccederMois.verifierMois(nomClient, nomComtpe);
		if (!moisExiste) {
			System.out.println("L'accès à ce compte est impossible car il n'existe pas\n");
		}
		else {
			int choix_utilisateur;
			do {
				System.out.println("Que voulez-vous effectuer avec ce compte ?\n");
				StringBuilder question = new StringBuilder();
				question.append("1 - Acceder à une période\n");
				question.append("2 - Ajouter une période\n");
				question.append("3 - Supprimer une période\n");
				question.append("4 - Avoir une vu d'ensemble du mois\n");
				question.append("5 - Quitter cette fenêtre\n");
				
				choix_utilisateur = Clavier.entrerEntier(question.toString());
				switch (choix_utilisateur) {
				case 1 :
					boundaryAccederPeriode.accederPeriode();
					break;
				case 2 :
					boundaryAjouterPeriode.ajouterPeriode();
					break;
				case 3 :
					boundarySupprimerMois.supprimerMois();
					break;
				case 4 :
					boundaryAfficherInfosMois.afficherInfosMois(nomCompte, nom);
					break;
				case 5 :
					System.out.println("A +");
					break;
				default :
					System.out.println("Saisisser un nombre entre 1 et 5");
					break;
				}
				
			} while (choix_utilisateur != 5);
		}
	}

}
