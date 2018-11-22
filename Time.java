package listeBot;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time extends GeneralBot{
	public Time() {

	}
	 public String action(String pseudo){
	  Date date = new Date();
	  SimpleDateFormat time = null;
	  time = new SimpleDateFormat("'Nous sommes le' EEEE dd MMMM yyyy 'et il est' HH'h'mm'.'");
	  String time_bot = time.format(date);
	  return time_bot;
	 }
}
