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
	 * Constructeur avec param�tres
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
	 * Renvoie le d�couvert maximum
	 * 
	 * @return double
	 */
	public double getDecouvert() {
		return this.decouvert;
	}
	
//----- Modificateurs
	/**
	 * Modifie le d�couvert maximal
	 * 
	 * @param montant
	 */
	public void setDecouvert(double montant) {
		this.decouvert = montant;
	}
	
//----- M�thodes
	/**
	 * Proc�dure de cr�ditation du solde.
	 * La cr�ditation ne s'effectue que si le montant
	 * pass� est positif.
	 * 
	 * @param montant
	 */
	public void crediter(double montant) {
		if (isMontantPositif(montant))
			super.setSolde(super.getSolde() + montant);
	}
	
	/**
	 * Fonction de d�bit du compte.
	 * Le d�bit ne s'effectue que si le montant
	 * pass� est positif
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
	 * V�rifie si un montant est positif
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
