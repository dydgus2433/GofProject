package y.h.lee.bridge;

public class RandomCountDisplay extends CountDisplay{

	public RandomCountDisplay(DisplayImpl impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}

	//9-1
	public void randomDisplay(int times) {
		int randomNum = (int) (Math.random()* 10 + 1);
		if(0 <= randomNum && randomNum < times) {
			multiDisplay(randomNum);
		}
	}
}
