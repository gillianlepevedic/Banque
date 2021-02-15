public class Compte {
	private String numero;
	private Personne titulaire;
	private double solde;	
	
	public Compte(String numero, Personne titulaire){
		this.numero = numero;
		this.titulaire = titulaire;
		this.solde = 0;
	}
	
	public Compte(){
		this.numero = "-1";
		this.titulaire = new Personne();
		this.solde = -1;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", titulaire=" + titulaire + ", solde=" + solde + "]";
	}

	public String getNumero() {
		return numero;
	}

	public Personne getTitulaire() {
		return titulaire;
	}

	public double getSolde() {
		return solde;
	}
	
	public void deposer(double argent) {
		this.solde += argent;
		System.out.println("Argent déposé");
	}
	
	public void retirerArgent(double argent) throws Exception {
	    if (this.solde >= argent) {
	    	this.solde -= argent;
	    }else {
	    	  throw new Exception("Erreur : Pas assez d'agent sur le compte");
	    }
	}
}
