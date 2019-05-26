package y.h.lee.factory.tablefactory;

import y.h.lee.factory.abstractfactory.Link;

public class TableLink extends Link {

	public TableLink(String caption, String url) {
		super(caption, url);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
	}

}
