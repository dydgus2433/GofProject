package y.h.lee.bridge;

public class Main {
	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Korea"));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World"));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("Hello, Universe."));
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		d4.randomDisplay(5);
		Display d5 = new Display(new FileDisplayImpl("Greeting.html"));
		d5.display();
		
		CountDisplay d6 = new CountDisplay(new CharDisplayImpl("##",'<','>',5));
		d6.multiDisplay(5);
	}
}
