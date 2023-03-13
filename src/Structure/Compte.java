package Structure;

import Element.Transaction;

public class Compte {
	
	public static final int MAX_NB_TRANSACTION = 50;
	private Client client;
	private int solde;
	private Transaction[] transactions = new Transaction[MAX_NB_TRANSACTION];
	private int nombreTransactions = 0;
	
	public Compte(Client client, int solde) {
		this.client = client;
		this.solde = solde;
	}
	
	public int getSolde() {
		return solde;
	}
	
	public void setSolde(int nouvelleSolde) {
		solde = nouvelleSolde;
	}
	
	public void debiterCompte(int montant) {
		solde += montant;
	}
	
	public void crediterCompte(int montant) {
		solde -= montant;
	}
	
	public void effectuerTransaction(String date, String nom, int montant) {
		String type;
		if(montant < 0) type = "credit";
		else type = "debit";
		transactions[nombreTransactions ++] = new Transaction(montant, date, nom, type);
		solde += montant;
	}
	
	public String visualisationDeCompte() {
		StringBuilder chaine = new StringBuilder();
		chaine.append(client.getPrenom() + ", voici toutes les transactions effectuées depuis la création du compte :\n");
		for(int i = 0; i<nombreTransactions; i++) {
			chaine.append(transactions[i].descriptionTransaction() + "\n");
		}
		chaine.append("Vous avez en tout : " + solde);
		return chaine.toString();
	}
}
