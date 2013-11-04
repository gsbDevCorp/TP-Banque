
public class Test {
	
	public static void main(String args[]){
	Banque banque= new Banque();
	Compte compte1 = new Epargne(1234, "DAGGAG", 4563);
	Compte compte2 = new Epargne(8975, "BILLY", 5644);
	
	
//	banque.ajoute(compte1);
//	banque.ajoute(compte2);
	
	compte1.credit(1500);
	if(!compte1.debite(600))
		System.out.println("Débit Impossible");
	System.out.println("Le solde du compte " +compte1.getClient() + " est de " +compte1.getSolde()+ " €");
	
	
	compte2.credit(1000);
	compte2.debite(2000);
	System.out.println("Le solde du compte " +compte2.getClient() + " est de " +compte2.getSolde()+ " €");
	
}

}
