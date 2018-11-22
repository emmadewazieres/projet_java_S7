package listeBot;

public class Quit extends GeneralBot{
	public String action(String pseudo){
		System.exit(1);
		return "End of program";
	}
}
