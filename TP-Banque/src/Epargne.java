
public class Epargne extends Compte{

	private float taux;

	//constructeur vide
	public Epargne(){

	}
	//constructeur avec tous les attributes
	public Epargne(int numero, double solde, float taux) {
		super();
		this.taux = taux;
	}
	//retourne le taux
	public double getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}
	//retourne le solde du compte epargne
	public double soldeCompte() {
		double soldeTotal;
		soldeTotal = super.getSolde();
		soldeTotal = soldeTotal * taux / 100 + soldeTotal;
		return soldeTotal;
	}
	//Transfert de montant du compte vers un autre compte
	public boolean transferer(Compte compte, double montant){
		boolean reponse = false;
		if(super.getSolde() >= montant){
			super.debiter(montant);
			compte.crediter(montant);
			reponse = true;
		}
		else {
			return false;
		}
		return reponse;
	}
	//méthode toString
	public String toString() {
		return super.toString();
	}
}



