package y.h.lee.iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("피터팬"));
		bookShelf.appendBook(new Book("Grit"));
		bookShelf.appendBook(new Book("프로그래머처럼 생각하기"));
		bookShelf.appendBook(new Book("Effective Java 3"));
		bookShelf.appendBook(new Book("Effective Java 4"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
}
