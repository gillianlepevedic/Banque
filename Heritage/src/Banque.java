import java.util.ArrayList;
import java.util.List;

public class Banque {
	private List<Compte> ListeDeCompte;
	private int nbMaxDeCompte;
	
	public Banque() {
		ListeDeCompte = new ArrayList<>();
		this.nbMaxDeCompte = 100;
	}
	
	public Banque(int nbMaxDeCompte) {
		this.nbMaxDeCompte = nbMaxDeCompte;
		ListeDeCompte = new ArrayList<>(nbMaxDeCompte);
	}

	@Override
	public String toString() {
		return "Banque [ListeDeCompte=" + ListeDeCompte + ", nbMaxDeCompte=" + nbMaxDeCompte + "]";
	}

	public List<Compte> getListeDeCompte() {
		return ListeDeCompte;
	}

	public int getNbMaxDeCompte() {
		return nbMaxDeCompte;
	}
	
	public void AjouterUnCompte(Compte compteAjouter) throws Exception {
		if (this.ListeDeCompte.size()< this.nbMaxDeCompte) {
			ListeDeCompte.add(compteAjouter);
		}else {
			throw new Exception("Erreur : nombres de compte maximum atteint. Max = " + this.nbMaxDeCompte);
		}
	}
}
