import java.util.ArrayList;


public class Client {

	private String client;
	private String compte;
	private int id;
	private String nom;
	private String prenom;
	
	//arrayList de compte
	ArrayList<Compte> comptes = new ArrayList<Compte>();
	
	//constructeur vide
	public Client(){
		
	}
	
	//constructeur avec tous les attributs
	public Client(String client, String compte, int id){
		this.client = client;
		this.compte = compte;
		this.id = id;
	}
	
	//ajoute un compte
	public void ajoute(Compte compte) {
		comptes.add(compte);
		
	}
	
}