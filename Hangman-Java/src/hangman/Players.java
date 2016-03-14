package hangman;
// hangman package imported
import java.io.Serializable;

public class Players implements Serializable{
	
	private String name; //private string
	private int scores;

	public Players(String name, int scores) {
		this.name = name;
		this.scores = scores;
	}
	
	
	
	
	public String getName() { //getname declared
		return name;
	}

	public int getScores() {
		return scores;
	}

	

}
