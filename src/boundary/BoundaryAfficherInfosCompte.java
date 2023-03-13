package boundary;

public class BoundaryAfficherInfosCompte {
	
	private ControlAfficherInfosCompte controlAfficherInfosCompte;
	
	public BoundaryAfficherInfosCompte(ControlAfficherInfosCompte controlAfficherInfosCompte) {
		this.controlAfficherInfosCompte = controlAfficherInfosCompte;
	}
	
	public void afficherInfosCompte(String nomCompte, String nomClient) {
		System.out.println(afficherMois(nomCompte, nomClient));
		System.out.println(afficherPeriode(nomCompte, nomClient));
		System.out.println(afficherTransaction(nomCompte, nomClient));
	}
	
	private String afficherMois(String nomCompte, String nomClient) {
		StringBuilder chaineMois = new StringBuilder();
		String[] mois = controlAfficherInfosCompte.donnerMois(nomCompte, nomClient);
		if (mois != null) {
			for(int i = 0; i < mois.length; i++) {
				chaineMois.append(mois[i] + "\n");
			}
		}
		return chaineMois.toString();
	}
	
	private String afficherPeriode(String nomCompte, String nomClient) {
		StringBuilder chainePeriode = new StringBuilder();
		String[] periodes = controlAfficherInfosCompte.donnerPeriode(nomCompte, nomClient);
		if (periodes != null) {
			for (int i = 0; i < periodes.length; i++) {
				chainePeriode.append("\t" + periodes[i] + "\n");
			}
		}
		return chainePeriode.toString();
	}
	
	private String afficherTransaction(String nomCompte, String nomClient) {
		StringBuilder chaineTransaction = new StringBuilder();
		String[] transactions = controlAfficherInfosCompte.donnerTransactions(nomCompte, nomClient);
		if (transactions != null) {
			for (int i = 0; i < transactions.length; i++) {
				chaineTransaction.append("\t\t" + transactions[i] + "\n");
			}
		}
		return chaineTransaction.toString()	;
	}

}
