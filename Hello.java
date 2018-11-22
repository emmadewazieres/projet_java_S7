package listeBot;


public class Hello extends GeneralBot{

	//constructeur
	public Hello() {
		
	}
	//méthode
	public String action(String pseudo){
	  String hello_bot = "[hello] Salut " + pseudo + " ! " ;
	  return hello_bot;
	}
}