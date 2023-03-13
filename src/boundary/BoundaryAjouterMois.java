package boundary;

import java.util.Scanner;

public class BoundaryAjouterMois {
	
	private ControlAjouterMois controlAjouterMois;
	
	private Scanner scan = new Scanner(System.in);
	
	public BoundaryAjouterMois(ControlAjouterMois controlAjouterMois) {
		this.controlAjouterMois = controlAjouterMois;
	}
	
	public void ajouterMois() {
		String nomMois;
		int budget;
		
		System.out.println("Quelle est le nom du mois que vous voulez rajouter ?");
		nomMois = scan.next();
		
		budget = Clavier.entrerEntier("Quelle est le budget allouer à ce mois ?");
		while (!controlAjouterMois.verifierBudget(budget, nomCompte, nomClient)) {
			budget = Clavier.entrerEntier("Saisisser un budget correct.");
		}
		controlAjouterMois.ajouterMois(nomMois, budget, nomCompte, nomClient);
	}

}
