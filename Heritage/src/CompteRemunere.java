public class CompteRemunere extends Compte {
	private double remuneration;

	public CompteRemunere() {
		super();
		this.remuneration = 0;
	}

	public CompteRemunere(String numero, Personne titulaire, double remuneration) {
		super(numero, titulaire);
		this.remuneration = remuneration;
	}
	
	public CompteRemunere(String numero, Personne titulaire) {
		super(numero, titulaire);
	}

	public double getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}

	@Override
	public String toString() {
		return "CompteRemunere [remuneration=" + remuneration + ", toString()=" + super.toString() + "]";
	}
}
