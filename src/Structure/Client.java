package Structure;

public class Client {
	
	public static final int MAX_NB_COMPTE = 5;
	private String nom;
	private String prenom;
	private String adresseMail;
	private String numTelephone;
	private Compte[] comptes = new Compte[MAX_NB_COMPTE];
	private int nombreCompte = 0;
	
	public Client(String nom, String prenom, String adresseMail, String numTelephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
		this.numTelephone = numTelephone;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	public String getNumTelephone() {
		return numTelephone;
	}

	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}

	public void ajouterCompte(Compte nouveauCompte) {
		assert(nombreCompte < MAX_NB_COMPTE);
		comptes[nombreCompte ++] = nouveauCompte;
	}
}
