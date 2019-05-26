package y.h.lee.builder;

public class Director {
	private Builder builder;
	public Director (Builder builder) { //Builder �� ���� Ŭ������ �ν��Ͻ��� �־����Ƿ�
		this.builder = builder;			// builder �ʵ忡 �����صд�.
	}
	
	public void construct() {
		
		builder.makeString("�԰�������");
		builder.makeTitle("Greeting");	
		builder.makeString("��ħ�� ����");
		builder.makeItems(new String[] {
				"�ȳ��ϼ���",
				"�ȳ����ֹ�����",
				"�ȳ��� �輼��",
		});
		builder.close();
	}
	
}
