package by.epam.hw07.oop.task09;

import java.util.Arrays;

public class Book {

	private static long id = 1;

	private long bookId;
	private String title;
	private Author[] authors;
	private String publishingHouse;
	private int yearOfPublishing;
	private int pagesCount;
	private double price;
	private Binding binding;

	public Book(String title, Author[] authors, String publishingHouse, int yearOfPublishing, int pagesCount,
			double price, Binding binding) {
		this.bookId = id++;
		this.title = title;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.yearOfPublishing = yearOfPublishing;
		this.pagesCount = pagesCount;
		this.price = price;
		this.binding = binding;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	public int getPagesCount() {
		return pagesCount;
	}

	public void setPagesCount(int pagesCount) {
		this.pagesCount = pagesCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Binding getBinding() {
		return binding;
	}

	public void setBinding(Binding binding) {
		this.binding = binding;
	}

	@Override
	public String toString() {
		return String.format("Id=%d, %s, " + Arrays.toString(authors) + ", %s, %d, %d, %.1f, " + binding, bookId, title,
				publishingHouse, yearOfPublishing, pagesCount, price);
	}

}
