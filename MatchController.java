package Cricket;

import java.util.*;

public class MatchController {

	private Player p1 = Player.getInstance();
	
	private Player p2=Player.getInstance();
	
	private Chooser<String> choose;
	
	public  MatchController (List<String> list) { 
		
		choose=new Chooser<String>(list);
		
	}
	
	private void innings(Player p,int overs)
	{
		p.setRemainigBalls(overs*6);
		while(p.getWicket()>0||p.getRemainigBalls()>0)
		{
			String run=choose.choose();
			if(run.equals("W"))
				p.setWicket(Integer.parseInt("1"));
			else 
				p.setRuns(Integer.parseInt(run));
			p.setRemainigBalls(-1);
		}
	}
	public void begin(int overs)
	{

		innings(p1,overs);
		
		innings(p2,overs);
		
		System.out.println("Game begins! ");
		
		System.out.println("Total Runs Scored by Player1 :"+p1.getRuns());
		
		System.out.println("Total Runs Scored by Player2 :"+p2.getRuns());
		
		if(p1.getRuns()>p2.getRuns())
			System.out.println("Player1 wins!");
		
		else if(p2.getRuns()>p1.getRuns())
			System.out.println("Player2 wins!");
		
		else System.out.println("The game was a tie!");
	}
}
