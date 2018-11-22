package chatbot;

public class Pseudo {
	//attributs
	private String pseudo;
	private int nbArg;
	//constructeur
	public Pseudo(int nbArg) throws PseudoInvalide {
		if (nbArg < 2)
			throw new PseudoInvalide();
	}
	//méthode
	public String nom(String pseudo) {
		String nom = pseudo;
		return nom;
	}
}

