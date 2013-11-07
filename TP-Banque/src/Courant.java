/**
 * 
 * @author Robin Billy - SIO2
 * 
 * Classe compte courant
 * 
 * @extends Compte
 */
public class Courant extends Compte {

//----- Attributs
	private double decouvert;
	
//----- Constructeurs
	
	/**
	 * Constructeur vide
	 */
	public Courant() {}
	
	/**
	 * Constructeur avec paramètres
	 * 
	 * @param client
	 * @param id
	 * @param decouvert
	 */
	public Courant(int id, double solde, double decouvert) {
		super(id, solde);
		this.setDecouvert(decouvert);
	}

//----- Accesseurs
	/**
	 * Renvoie le découvert maximum
	 * 
	 * @return double
	 */
	public double getDecouvert() {
		return this.decouvert;
	}
	
//----- Modificateurs
	/**
	 * Modifie le découvert maximal
	 * 
	 * @param montant
	 */
	public void setDecouvert(double montant) {
		this.decouvert = montant;
	}
	
//----- Méthodes
	/**
	 * Procédure de créditation du solde.
	 * La créditation ne s'effectue que si le montant
	 * passé est positif.
	 * 
	 * @param montant
	 */
	public void crediter(double montant) {
		if (isMontantPositif(montant))
			super.setSolde(super.getSolde() + montant);
	}
	
	/**
	 * Fonction de débit du compte.
	 * Le débit ne s'effectue que si le montant
	 * passé est positif
	 * 
	 * @param montant
	 * @return boolean
	 */
	public boolean debiter(double montant) {
		if (isMontantPositif(montant)) {
			if ((super.getSolde() - montant) < this.decouvert) {
				super.setSolde(super.getSolde() - montant);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Fonction de transfert d'un montant du compte
	 * vers un autre.
	 * 
	 * @param montant
	 * @param numero
	 * @return boolean
	 */
	public boolean transfertCompte(double montant, int numero) {
		if (isMontantPositif(montant)) {
			return super.transfertCompte(montant, numero);
		}
		return false;
	}
	
	/**
	 * Vérifie si un montant est positif
	 * 
	 * @param montant
	 * @return boolean
	 */
	public boolean isMontantPositif(double montant) {
		if (montant >= 0)
			return true;
		return false;
	}
}
