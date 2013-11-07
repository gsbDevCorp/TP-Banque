/**
 * 
 * @author Robin Billy - Chafik Daggag - SIO2
 * 
 * Classe main, permet de tester la validité du code
 *
 */
public class Test {
	
	public static void main(String args[]){
		
		// Instanciation de la banque
		Banque banque= new Banque();
		
		// Instanciation des clients
		Client client1 = new Client("Richard", "Partick", 935476);
		Client client2 = new Client("Lemaire", "Jean", 234874);
		Client client3 = new Client("Si", "René", 326547);
		
		//Création de comptes aux clients
		client1.ajouterCompte(new Courant(1,234.21,500));
		client1.ajouterCompte(new Epargne(2,3241.58,7));
		client2.ajouterCompte(new Courant(3,234.21,500));
		client2.ajouterCompte(new Epargne(4,3241.58,7));
		client3.ajouterCompte(new Courant(5,234.21,500));
		client3.ajouterCompte(new Epargne(6,3241.58,7));
		
		//Ajout des clients à la banque
		banque.ajoutClient(client1);
		banque.ajoutClient(client2);
		banque.ajoutClient(client3);
	
}

}

