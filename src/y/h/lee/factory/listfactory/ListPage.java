package y.h.lee.factory.listfactory;
import java.util.Iterator;

import y.h.lee.factory.abstractfactory.Item;
import y.h.lee.factory.abstractfactory.Page;

public class ListPage extends Page {
	
	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>" + title + "</title></head>\n");
		buffer.append("<body>\n");
		buffer.append("<h1>" + title + "</h1>\n");
		buffer.append("<ul>\n");
		Iterator iterator = content.iterator();
		while(iterator.hasNext()) {
			Item item = (Item)iterator.next();
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("<hr><address>"+ author + "</address>");
		buffer.append("</body></html>\n");
		return buffer.toString();
	}

}
