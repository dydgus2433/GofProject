package y.h.lee.bridge;

import java.util.Random;

public class CountDisplay extends Display{

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	public void multiDisplay(int times) {
		open();
		for(int i =0; i < times; i++) {
			print();
		}
		close();
	}
	
	//9-1
	public void randomDisplay(int times) {
		int randomNum = (int) (Math.random()* 10 + 1);
		if(0 <= randomNum && randomNum < times) {
			multiDisplay(randomNum);
		}
	}
}
