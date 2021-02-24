package Cricket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rules {
	
private static int totalOvers=0;

private static int totalWickets=0;

private static List<String> runs=new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","W"));

private static Rules obj;

public static Rules getInstance()
{
	if(obj==null)obj= new Rules();
	 return obj;
}
public static List<String> getRuns() {
	return runs;
}

public static void setRuns(List<String> runs) {
	Rules.runs = runs;
}

public  int getTotalOvers() {
	return totalOvers;
}

public void setTotalOvers(int totalOvers) {
	this.totalOvers = totalOvers;
}

public int getTotalWickets() {
	return totalWickets;
}

public void setTotalWickets(int totalWickets) {
	this.totalWickets = totalWickets;
}
public void displayRules()
{
	System.out.println("The rules of the game are as follows \n 1. Maximum number of overs per innings:"+this.getTotalOvers()+
			"\n 2. Maximum number of Wickets: " + this.getTotalWickets()
					+ "\n 3. The team which scores maximum runs wins");
	
}

}
