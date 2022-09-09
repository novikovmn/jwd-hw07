package by.epam.hw07.oop.task09.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw07.oop.task09.bean.Book;
import by.epam.hw07.oop.task09.bean.BookStore;

public class BookStoreLogic {

	/*
	 * show books after given year
	 */
	public List<Book> showBooksAfterGivenYear(BookStore bookStore, int givenYear) {
		List<Book> books = bookStore.getBooks();
		List<Book> booksAfterGivenYear = new ArrayList<>();

		for (Book book : books) {
			if (book.getYearOfPublishing() > givenYear) {
				booksAfterGivenYear.add(book);
			}
		}

		return booksAfterGivenYear;
	}

	/*
	 * show books by publishing house
	 */
	public List<Book> showBooksByPublishingHouse(BookStore bookStore, String publishingHouse) {
		List<Book> books = bookStore.getBooks();
		List<Book> booksByPublishingHouse = new ArrayList<>();

		for (Book book : books) {
			if (book.getPublishingHouse().equals(publishingHouse)) {
				booksByPublishingHouse.add(book);
			}
		}

		return booksByPublishingHouse;
	}

	/*
	 * show books by author
	 */
	public List<Book> showBooksByAuthor(BookStore bookStore, String authorLastName) {
		List<Book> books = bookStore.getBooks();
		List<Book> booksByAuthor = new ArrayList<>();

		for (Book book : books) {
			for (int i = 0; i < book.getAuthors().length; i++) {
				if (book.getAuthors()[i].getLastName().equals(authorLastName)) {
					booksByAuthor.add(book);
				}
			}
		}

		return booksByAuthor;
	}

}
