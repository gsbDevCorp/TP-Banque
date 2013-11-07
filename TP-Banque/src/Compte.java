/**
 * 
 * @author Robin Billy - Chafik Daggag - SIO2
 * 
 * Classe compte courant
 * 
 * @extends Client
 */
public class Compte extends Client {
	
	private int numero;
	private double solde;
	
	//constructeur vide
	public Compte() {}
	
	//constructeur avec tous les attibuts
	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero() {
		this.numero = numero;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	/**
	 * Retourne le solde du compte
	 * 
	 * @return double
	 */
	public double getSolde() {
		return this.solde;
	}
	//crédite le solde d'un montant fourni
		public void crediter(double montant) {
			solde = solde + montant;
		}
		//débite le solde d'un montant fourni
		//et retourner un booléen
		public boolean debiter(double montant) {
			boolean reponse;
			if (solde < montant) {
				reponse = false;
			}
			else {
				solde = solde - montant;
				reponse = true;
			}
			return reponse;
		}

	
	/**
	 * Transfert de montant du compte vers
	 * un autre compte
	 * 
	 * @param montant
	 * @param numero
	 * @return boolean
	 */
	public boolean transfertCompte(double montant, int numero) {
		for (Compte compte : super.comptes) {
			if (compte.getNumero() == numero) {
				compte.setSolde(compte.getSolde() + montant);
				this.setSolde(this.getSolde() - montant);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Comparaison du solde du compte avec
	 * un autre compte
	 * 
	 * @param numero
	 * @return boolean
	 */
	public boolean comparerCompte(int numero) {
		for (Compte compte : super.comptes) {
			if (compte.getNumero() == numero) {
				if (this.getSolde() >= compte.getSolde())
					return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return ("Compte n°" + this.numero + ". Solde : " + this.solde);
	}
}
