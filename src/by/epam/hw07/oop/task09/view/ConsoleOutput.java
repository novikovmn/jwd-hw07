package by.epam.hw07.oop.task09.view;

import java.util.List;

import by.epam.hw07.oop.task09.bean.Book;

public class ConsoleOutput {

	public void printBooks(List<Book> books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}

}
