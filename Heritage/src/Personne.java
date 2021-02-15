public class Personne {
		private String nom;
		private String prenom;
		private String adresse;
		
		
		public Personne(String nom, String prenom, String adresse) {
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
		}
		
		public Personne() {
			this.nom = "Dupont";
			this.prenom = "Jean";
			this.adresse = "1 rue de France, Perdu 22300";
		}

		@Override
		public String toString() {
			return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
		}

		public String getNom() {
			return nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public String getAdresse() {
			return adresse;
		}	
}
