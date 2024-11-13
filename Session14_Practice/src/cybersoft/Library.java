package cybersoft;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books = new ArrayList<Book>();

	public Library(List<Book> books) {
		this.books = books;
	}

	public Library() {
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void showBook() {
		for (Book book : books) {
			System.out.println("Tên sách: " + book.getTitle() + ", " + "Tác giả: " + book.getAuthor() + ", " + "Trạng thái: " + book.isStatus());
		}
	}

}
