import java.util.ArrayList;

public class Banque {
	
//----- Attributs
	ArrayList<Client> clients;

//----- Constructeurs
	public Banque(){ 
		this.clients = new ArrayList<Client>();
	}

//----- Méthodes
	/**
	 * Fonction retournant le client le plus riche
	 * de la banque, tous comptes confondus.
	 * 
	 * @return Client
	 */
	public Client plusRiche() {
		double solde = 0.0;
		Client clientPlusRiche;
		for(Client client : this.clients) {
			if (client.soldeGeneral() >= solde)
				clientPlusRiche = client;
		}
		return clientPlusRiche;
	}
	
	/**
	 * Fonction retournant une liste de clients
	 * ayant un solde négatif sur au moins un
	 * compte.
	 * 
	 * @return ArrayList<Client>
	 */
	public ArrayList<Client> aDecouvert() {
		ArrayList<Client> clientsDecouvert = new ArrayList<Client>();
		boolean decouvert = false;
		for(Client client : clients) {
			for(Compte compte : client.comptes) {
				if(compte.getSolde() < 0 )
					decouvert = true;
			}
			if (decouvert == true) {
				clientsDecouvert.add(client);
				decouvert = false;
			}
		}
		return clientsDecouvert;
	}
	
	/**
	 * Procédure d'ajout d'un client à la liste
	 * des clients de la banque
	 * 
	 * @param Client
	 * @return void
	 */
	public void ajoutClient(Client client) {
		this.clients.add(client);
	}
}