package Structure;

import Element.Transaction;

public class Mois {
	
	public static final int MAX_NB_TRANSACTION = 50;
	private String nom;
	private int argentDebutMois;
	private int epargne;
	private Compte compte;
	private Transaction[] transactions = new Transaction[MAX_NB_TRANSACTION];
	private int nombreTransaction = 0;
	
	public Mois(String nom, int argent, Compte compte) {
		this.nom = nom;
		this.argentDebutMois = argent;
		this.epargne = argent;
		this.compte = compte;
	}
	
	public int getEpargne() {
		return epargne;
	}

	public void setEpargne(int epargne) {
		this.epargne = epargne;
	}

}
