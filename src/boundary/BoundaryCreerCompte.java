package boundary;

import java.util.Scanner;

public class BoundaryCreerCompte {
	
	private ControlCreerCompte controlCreerCompte;
	
	private Scanner scan = new Scanner(System.in);
	
	public BoundaryAfficherCompte(ControlCreerCompte controlCreerCompte) {
		this.controlCreerCompte = controlCreerCompte;
	}
	
	public void creerCompte(String nom) {
		String nomCompte;
		int soldeCompte;
		
		System.out.println("Très bien " + nom + ", il me faudrait quelques renseignement sur ce nouveau compte \n");
		nomCompte = scan.next();
		soldeCompte = Clavier.entrerEntier("Quelle est la solde du compte ?");
		
		while (soldeCompte < 0) {
			System.out.println("Veuillez saisir une valeur positive.\n");
			soldeCompte = Clavier.entrerEntier(" ");
		}
		
		controlCreerCompte.creerCompte(nom, nomCompte, soldeCompte);
	}

}
