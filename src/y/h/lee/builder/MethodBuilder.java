package y.h.lee.builder;

public class MethodBuilder extends Builder {

	private StringBuffer buffer = new StringBuffer();


	public String getResult() {
		return buffer.toString();
	}

	@Override
	public void buildTitle(String title) {
		String temp  = title.replaceAll(" ", "");
		buffer.append("public class "+temp.trim() + "{\n");
		
	}

	@Override
	public void buildString(String str) {
		String temp  = str.replaceAll(" ", "");
		buffer.append("\tpublic void "+ temp + "(){\n");
		
	}

	@Override
	public void buildItems(String[] items) {
		buffer.append("\t\tString str = ");
		for (int i = 0; i < items.length; i++) {
			if(i == 0 ) {
				buffer.append("\"" + items[i] + "\\n\"\n");
			}else if(i == items.length - 1) {
				buffer.append("\t\t+\"" + items[i] + "\\n\"");
			}else {
				buffer.append("\t\t+\"" + items[i] + "\\n\"\n");
			}
		}
		buffer.append(";\n");
		
	}

	@Override
	public void buildClose() {
		buffer.append("\t\tSystem.out.println(str);\n");
		buffer.append("\t}\n");
		buffer.append("}\n");
		
	}

}
