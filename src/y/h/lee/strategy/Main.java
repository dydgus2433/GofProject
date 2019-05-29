package y.h.lee.strategy;

public class Main {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Usage : java Main randomseed1 randomseed2");
			System.out.println("Example : java Main 314 15");
			System.exit(0);
		}
		int seed1 = Integer.parseInt(args[0]);
		int seed2 = Integer.parseInt(args[1]);
		
		Player player1 = new Player("�θ�", new WinningStrategy(seed1));
		Player player2 = new Player("�ϳ�", new ProbStrategy(seed2));
		final int gamecount = 1000000;
		for(int i =0; i < gamecount; i++) {
			Hand nextHand1 = player1.nextHand();
			Hand nextHand2 = player2.nextHand();
			if(nextHand1.isStrongerThanHand(nextHand2)) {
				System.out.println("Winner : " + player1);
				player1.win();
				player2.lose();
			}else if(nextHand2.isStrongerThanHand(nextHand1)) {
				System.out.println("Winner : "+player2);
				player1.lose();
				player2.win();
			}else {
				System.out.println("Even ..");
				player1.even();
				player2.even();
			}
		}
		System.out.println("Total Record :");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
	}

}
