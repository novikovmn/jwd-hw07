package by.epam.hw07.oop.task09;

import java.util.Arrays;

public class BookStore {

	private Book[] books;

	public BookStore(Book[] books) {
		this.books = books;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	public void printBooks() {
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	public void showBooksAfterGivenYear(int givenYear) {
		for (int i = 0; i < books.length; i++) {
			if (books[i].getYearOfPublishing() > givenYear) {
				System.out.println(books[i]);
			}
		}
	}
	
	public void showBooksByPublishingHouse(String publishingHouse) {
		for (int i = 0; i < books.length; i++) {
			if (books[i].getPublishingHouse().equals(publishingHouse)) {
				System.out.println(books[i]);
			}
		}
	}
	
	public void showBooksByAuthor(String autorsLastName) {
		for (int i = 0; i < books.length; i++) {			
			for (int j = 0; j < books[i].getAuthors().length; j++) {
				if(books[i].getAuthors()[j].getLastName().equals(autorsLastName)) {
					System.out.println(books[i]);
				}
			}			
		}
	}
	

	@Override
	public String toString() {
		return "BookStore [books=" + Arrays.toString(books) + "]";
	}

}
