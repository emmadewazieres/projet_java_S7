package chatbot;

public class PseudoInvalide extends Exception{
	public PseudoInvalide() {
		System.out.println("Votre pseudo est invalide.\nMode d'emploi : -p<pseudo>.");
		System.exit(1);
	}	
}
