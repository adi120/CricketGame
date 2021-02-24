package Cricket;

public class CricketGame {

	public static void main(String[] args) {
		
		Match match=Match.getInstance();
		
		Rules rules=new Rules();
		
		rules.setTotalOvers(6);
		
		rules.setTotalWickets(1);
		
		match.startGame();
        match.startGame();
	}

}
