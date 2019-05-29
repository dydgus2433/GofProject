package y.h.lee.strategy;

public class Player {
	private String name;
	private Strategy strategy;
	private int wincount;
	private int losecount;
	private int gamecount;
	private int evencount;
	
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}
	public Hand nextHand() {
		return strategy.nextHand();
	}
	
	public void win() {
		strategy.study(true);
		wincount++;
		gamecount++;
	}
	
	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}
	
	public void even() {
		gamecount++;
		evencount++;
	}
	@Override
	public String toString() {
		return "Player [name : " + name + ", win : " + wincount + ", lose : " + losecount
				+ ", game : " + gamecount + ", even : " + evencount + "]";
	}
	
	
}
