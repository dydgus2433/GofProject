package y.h.lee.prototype;

public class Main {

	public static void main(String[] args) {

		//준비
		Manager manager = new Manager();
		UnderlinePen upPen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("string message", upPen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);
		
		//생성
		Product p1 = manager.create("string message");
		p1.use("Hello, man~");
		
		Product p2 = manager.create("warning box");
		p2.use("Hello, man~");
		
		Product p3 = manager.create("slash box");
		p3.use("Hello, man~");
		
	}

}
