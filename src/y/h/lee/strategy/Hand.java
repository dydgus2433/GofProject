package y.h.lee.strategy;

public class Hand {
	

	public static final int HANDVALUE_BAWUI = 0;
	public static final int HANDVALUE_GAWUI = 1;
	public static final int HANDVALUE_BO = 2;
	private int handvalue;
	
	public Hand(int handvalue) {
		this.handvalue = handvalue;
	}
	
	public static final Hand[] hand = {
			new Hand(HANDVALUE_BAWUI),
			new Hand(HANDVALUE_GAWUI),
			new Hand(HANDVALUE_BO)
	};
	
	private static final String[] name = {
			"바위", "가위", "보"
	};
	
	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}
	
	public boolean isStrongerThanHand(Hand h) {
		return fight(h) == 1;
	}
	
	public boolean isWeakerThan(Hand h ) {
		return fight(h) == -1;
	}
	public boolean isEven(Hand h){
		return fight(h) == 0;
	}

	private int fight(Hand h) {
		if(this == h) {
			return 0;
		} else if((this.handvalue + 1 )%3 == h.handvalue) {
			return 1;
		}else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return name[handvalue];
	}
	
	
}
