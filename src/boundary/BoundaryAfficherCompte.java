package boundary;

public class BoundaryAfficherCompte {
	
	private ControlAfficherCompte controlAfficherCompte;
	
	public BoundaryAfficherCompte(ControlAfficherCompte controlAfficherCompte) {
		this.controlAfficherCompte = controlAfficherCompte;
	}
	
	public void afficherCompte(String nom) {
		boolean nomClientConnu = controlAfficherCompte.verifierIdentite(nom);
		if (!nomClientConnu) {
			System.out.println("Désolé, " + nom + " mais il faut être inscrit sur l'application pour l'utiliser.");
		}
		else {
			String[] comptes = controlAfficherCompte.donnerCompte(nom);
			if (comptes == null) {
				System.out.println("Vous n'avez aucun compte créer.");
			}
			else {
				int j = 1;
				for(int i = 0; i < comptes.length; i++) {
					System.out.println(j + " - " + comptes[i] + "\n");
					j++;
				}
			}
		}
	}
}
