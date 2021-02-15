public class Td4_Banque {
	public static void main(String[] arg) {
		Banque banque = new Banque(3);
		Personne wiwi = new Personne("Stephan", "William", "JSP");
		Personne sav = new Personne("Barbotaud", "Savinien", "JSP");
		Personne malo = new Personne("Le Roux", "Malo", "JSP");
		
		try {
			banque.AjouterUnCompte(new Compte("ATLAS", malo));
			banque.AjouterUnCompte(new CompteRemunere("1664", wiwi));
			banque.AjouterUnCompte(new Compte("Kro", sav));
		}catch(Exception e) {
			System.out.println(e);
		}

		System.out.println(banque);
	}

}
