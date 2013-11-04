
public class Compte {
	
	private String client;
	private int id;
	protected double solde;
	private double interet;
	
	//constructeur vide
	public Compte() {
		
	}
	
	//constructeur avec tous les attibuts
	public Compte(String client, int id) {
		this.client =client;
		this.id=id;
	}
	
	//cr�diter le solde d'un montant fourni
	public void credit(double montant){
		solde += montant;
	}
	
	//d�biter le solde d'un montant fourni
	public boolean debite(double montant) {
		return false;
	}
	
	//retourne le solde du compte(en prenant en compte les inter�ts)
	public double getSolde(){
		return solde;
	}
	
	//retourne les infos du client
	public String getClient(){
		return client;
	}
	
}
