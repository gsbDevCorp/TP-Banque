
public class Epargne extends Compte{
	
		public double depotMinimal;
		
		//constructeur vide
		public Epargne(){
		
		}
		
		//constructeur avec tous les attributs
		public Epargne(int id, String client, double depotMinimal){
			super(client, id);
			this.depotMinimal =depotMinimal;
			
		}
		
		//comparaison du solde de l'objet et du d�p�t
		public boolean debite(double montant){
			if(solde - montant < depotMinimal)
				return false;
			else{
				solde -= montant;
				return true;
			}
		}
	}


