package Cricket;
import java.util.*;
public class Match {
	
	private MatchController match;
	
	private Rules rules=Rules.getInstance();
	
	private static Match obj;
	
	public static Match getInstance() {
		
		if(obj==null) { obj=new Match();}
		
		return obj;
		
	}
	
	public void startGame() {
		
		match=new MatchController(Rules.getRuns());
		
		rules.displayRules();
		
		match.begin(rules.getTotalOvers());
	}
	
	

}
