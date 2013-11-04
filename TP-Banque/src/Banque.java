import java.util.ArrayList;

public class Banque {
	
	private String client;
	private int id;
	
	//arrayList de client
	ArrayList<Client> clients = new ArrayList<Client>();

	//constructeur vide
	public Banque(){
		

	}
	
	//constructeur avec tous les attributs
	public Banque(String client, int id){
		this.client = client;
		this.id = id;
	}
	//retourne le client le plus riche (tous comptes pris en compte)
	
	//retourne un ensemble de clients qui ont au moins un compte dans le rouge
	
	//ajoute un client
	public void ajoute(Client client) {
		clients.add(client);
		
	}
	
	

}
