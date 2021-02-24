package Cricket;

public class Player {
	private int runs=0;
	
	private int wicket=1;
	
	private int remainigBalls=0;
	
    public int getRemainigBalls() {
		return remainigBalls;
	}

	public void setRemainigBalls(int remainigBalls) {
		this.remainigBalls += remainigBalls;
	}
    
	public static Player getInstance()
	{
		return new Player();
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs += runs;
	}

	public int getWicket() {
		return wicket;
	}

	public void setWicket(int wicket) {
		this.wicket-= wicket;
	}
}
