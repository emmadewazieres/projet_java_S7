package test;

import chatbot.Bot;
import chatbot.PseudoInvalide;

import java.util.*;

public class Main {
	public static void main(String[] args) throws PseudoInvalide, InstantiationException, IllegalAccessException{
		Bot bot = new Bot(args.length,args[1]);
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		bot.bot(sc, str);
	}
}
