package y.h.lee.iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("������"));
		bookShelf.appendBook(new Book("Grit"));
		bookShelf.appendBook(new Book("���α׷���ó�� �����ϱ�"));
		bookShelf.appendBook(new Book("Effective Java 3"));
		bookShelf.appendBook(new Book("Effective Java 4"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
}
