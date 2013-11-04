
public class Courant extends Compte{
	
	//constructeur vide
	public Courant() {
		
	}
	
	//constructeur avec tous les attibuts
	public Courant(String client, int id) {
		super(client, id);
	}
	
	public boolean debite(double montant){
		if(solde - montant < 0){
			solde -= montant + (solde - montant);
			return true;
		}
		else{
			solde -= montant;
			return true;
		
		}
		
	}

}
