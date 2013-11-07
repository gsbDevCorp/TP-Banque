/**
 * 
 * @author Robin Billy - SIO2
 * 
 * Classe compte courant
 * 
 * @extends Client
 */
public class Compte extends Client {
	
	private String client;
	private int numero;
	private double solde;
	
	//constructeur vide
	public Compte() {}
	
	//constructeur avec tous les attibuts
	public Compte(String client, int numero) {
		this.client = client;
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
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
}
