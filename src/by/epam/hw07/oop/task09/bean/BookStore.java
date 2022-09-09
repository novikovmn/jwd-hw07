package by.epam.hw07.oop.task09.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookStore implements Serializable {

	private static final long serialVersionUID = -7269551092778604263L;

	private List<Book> books;

	public BookStore() {
		books = new ArrayList<>();
	}

	public BookStore(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	/*
	 * add book
	 */
	public void addBook(Book book) {
		books.add(book);
	}

	/*
	 * remove book
	 */
	public void removeBook(Book book) {
		books.remove(book);
	}

	@Override
	public int hashCode() {
		return Objects.hash(books);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookStore other = (BookStore) obj;
		return Objects.equals(books, other.books);
	}

	@Override
	public String toString() {
		return "BookStore [books=" + books + "]";
	}

}
