package y.h.lee.bridge;

public class CharDisplayImpl extends DisplayImpl{
	private char first;
	private char second;
	private char body;
	public CharDisplayImpl(char first, char body,  char second) {
		this.first = first;
		this.second = second;
		this.body = body;
	}

	@Override
	public void rawOpen() {
		System.out.print(first);
	}

	@Override
	public void rawPrint() {
		System.out.print(body);
	}

	@Override
	public void rawClose() {
		System.out.println(second);
	}
	
	

}
