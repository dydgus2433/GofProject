package y.h.lee.builder;

public class TextBuilder extends Builder{

	private StringBuffer buffer = new StringBuffer();
	
	public String getResult() {
		return buffer.toString();
	}

	@Override
	public void buildTitle(String title) {
		buffer.append("===================\n");
		buffer.append("¡¸"+ title + "¡¹");
		buffer.append("\n");
		
	}

	@Override
	public void buildString(String str) {
		buffer.append("¡Ø"+ str + "\n");
		buffer.append("\n");
		
	}

	@Override
	public void buildItems(String[] items) {
		for(int i =0; i < items.length; i++) {
			buffer.append(" £ª"+items[i]+"\n");
		}
		buffer.append("\n");
		
	}

	@Override
	public void buildClose() {
		buffer.append("===================\n");
		
	}

}
