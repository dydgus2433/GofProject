package y.h.lee.builder;

public class Director {
	private Builder builder;
	public Director (Builder builder) { //Builder 의 하위 클래스의 인스턴스가 주어지므로
		this.builder = builder;			// builder 필드에 저장해둔다.
	}
	
	public void construct() {
		
		builder.makeString("게겐프레싱");
		builder.makeTitle("Greeting");	
		builder.makeString("아침과 낮에");
		builder.makeItems(new String[] {
				"안녕하세요",
				"안녕히주무세요",
				"안녕히 계세요",
		});
		builder.close();
	}
	
}
