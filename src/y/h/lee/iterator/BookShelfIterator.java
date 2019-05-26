package y.h.lee.iterator;


public class BookShelfIterator implements Iterator {

	private BookShelf bookshelf;
	private int index;
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookshelf = bookShelf;
		this.index = 0;
	}
	
	
	@Override
	public boolean hasNext() {
		if( index < bookshelf.getLength()) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		Book book = bookshelf.getBookAt(index);
		index++;
		return book;
	}
	
}
