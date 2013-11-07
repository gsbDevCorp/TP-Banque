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
		Client client3 = new Client("Dupont", "René", 326547);
		
		//Instanciation de comptes
		Courant courant1 = new Courant(1,234.21,500);
		Courant courant2 = new Courant(2,234.21,500);
		Courant courant3 = new Courant(3,234.21,500);
		Epargne epargne1 = new Epargne(4,3241.58,7);
		Epargne epargne2 = new Epargne(5,3241.58,7);
		Epargne epargne3 = new Epargne(6,3241.58,7);
		
		//Création de comptes aux clients
		client1.ajouterCompte(courant1);
		client1.ajouterCompte(epargne1);
		client2.ajouterCompte(courant2);
		client2.ajouterCompte(epargne2);
		client3.ajouterCompte(courant3);
		client3.ajouterCompte(epargne3);
		
		//Ajout des clients à la banque
		banque.ajoutClient(client1);
		banque.ajoutClient(client2);
		banque.ajoutClient(client3);
		
		//Test de la classe banque
		System.out.println("Client le plus riche : " + banque.plusRiche());
		for(Client client : banque.aDecouvert())
			System.out.println("Client(s) à découvert : " + client);
		
		//Test de la classe client
		System.out.println("Comptes client 1 : ");
		client1.afficherComptes();
		System.out.println("Solde général client 2 : " + client2.soldeGeneral() + "€.");
		System.out.println(client3.etatCompte(courant3));
		
		//Test de la classe Compte
		System.out.println("Solde compte courant 1 : " + courant1.getSolde());
		courant1.crediter(150);
		System.out.println("Solde compte courant 1 : " + courant1.getSolde());
		courant1.debiter(37.99);
		System.out.println("Solde compte courant 1 : " + courant1.getSolde());
		System.out.println("Transfert de solde de compte à compte");
		System.out.println("Solde compte courant 2 : " + courant2.getSolde());
		courant2.transfertCompte(37.50,3);
		System.out.println("Solde compte courant 2 : " + courant2.getSolde());
		System.out.println("Comparaison de deux comptes");
		System.out.println(courant1.comparerCompte(4));
	}
}

