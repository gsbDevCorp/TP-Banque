import java.util.ArrayList;


public class Client {

	private int numero;
	private String nom, prenom;
	//arrayList de compte
	ArrayList<Compte> comptes = new ArrayList<Compte>();

	//constructeur vide
	public Client(){

	}
	//constructeur avec tous les attributs
	public Client(String nom, String prenom,  int numero){
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
	}
	//ajoute un compte
	public void ajoute(Compte compte) {
		comptes.add(compte);

	}
	//retourne le nom
	public String getNom() {
		return nom;
	}
	//retourne le prenom
	public String getPrenom() {
		return prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	//méthode d'ajout d'un compte
	public void ajouterCompte(Compte compte) {
		comptes.add(compte);
	}
	//méthode d'affichage d'un compte
	public void afficherComptes() {
		for (Compte c : comptes) {
			System.out.println(c);
		}
	}
	//méthode de calcul du solde général
	public double soldeGeneral() {
		double solde = 0.0;
		for (Compte c : comptes) {
			solde+=c.getSolde();
		}
		return solde;
	}
	
	//méthode comparative pour connaitre l'état du compte
	public String etatCompte(Compte compte) {
		String etat;
		if (compte.getSolde() <= 0) {
			etat = "rouge";
			return "Le client nommé " + this.toString() + " a un ou plusieurs comptes dans le " + etat + ".";
		}
		else {
			etat = "vert";
			return "Le client nommé " + this.toString() + " a un ou plusieurs comptes dans le " + etat + ".";
		}
	}
	//méthode toString
	public String toString() {
		return this.getNom() + " " + this.getPrenom();
	}

}