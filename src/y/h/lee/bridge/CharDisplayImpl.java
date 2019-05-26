package y.h.lee.bridge;

public class CharDisplayImpl extends StringDisplayImpl{
	private char first;
	private char second;
	private int multi;
	private int count = 0;
	public CharDisplayImpl(String string, char first, char second, int multi) {
		super(string);
		this.first = first;
		this.second = second;
		this.multi = multi;
	}

	@Override
	public void rawOpen() {
	}

	@Override
	public void rawPrint() {
		String str = "";
		for(int i =0; i < count; i++) {
			str += string;
		}
		System.out.println(first + str + second);
		count++;
	}

	@Override
	public void rawClose() {
		// TODO Auto-generated method stub
		
	}
	
	

}
