package y.h.lee.factory.abstractfactory;

public abstract class Link extends Item {
	protected String url;
	public Link (String caption, String url) {
		super(caption);
		this.url = url;
	}
}
