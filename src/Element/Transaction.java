package Element;

import Structure.Mois;

public class Transaction {
	
	private int montant;
	private String date;
	private String nom;
	private String type;
	private boolean etat = false;
	
	public Transaction(int montant, String date, String nom, String type) {
		this.montant = montant;
		this.date = date;
		this.nom = nom;
		this.type = type;
	}
	
	public int getMontant() {
		return montant;
	}
	
	public String getType() {
		return type;
	}
	
	public void setMontant(int nouveauMontant) {
		
		montant = nouveauMontant;
	}
	
	public void changerEtat() {
		if(etat) etat = false;
		else etat = true;
	}
	
	public String descriptionTransaction() {
		if(type == "credit") {
			return date + " " + nom + " : " + montant;
		}
		return date + " " + nom + " : +" + montant ;
		
	}

}
