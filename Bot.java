package chatbot;

import java.util.*;
import listeBot.*;

public class Bot {
	private String pseudo;
	private GeneralBot b;
	//constructeur
	public Bot(int nbArg, String pseudo)throws PseudoInvalide{
		Pseudo p = new Pseudo(nbArg);
		this.pseudo = p.nom(pseudo);
		System.out.print("["+this.pseudo+"] ");
	}
	//méthode
	public void bot(Scanner sc, String str) throws InstantiationException, IllegalAccessException{
		HashMap<String, Class> hmap = new HashMap<String, Class>();
		hmap.put("@hello", Hello.class);
		hmap.put("@time", Time.class);
		hmap.put("++",Quit.class);
		while(true) {
			if (hmap.containsKey(str)) {
				Class c = hmap.get(str);
				b = new GeneralBot();
				b = (GeneralBot) c.newInstance();
				System.out.println(b.action(this.pseudo));
				System.out.print("["+this.pseudo+"] ");
			}
			else {
				System.out.println("[system] Ce bot n'existe pas encore !");
				System.out.print("["+this.pseudo+"] ");
			}
			str = sc.nextLine();
		}
	}
}
