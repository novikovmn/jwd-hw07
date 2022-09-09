package by.epam.hw07.oop.task09;

import by.epam.hw07.oop.task09.bean.BookStore;
import by.epam.hw07.oop.task09.helper.BookStoreHelper;
import by.epam.hw07.oop.task09.logic.BookStoreLogic;
import by.epam.hw07.oop.task09.view.ConsoleOutput;

/*9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
	Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
	Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/

public class Main {

	public static void main(String[] args) {
		
		ConsoleOutput output = new ConsoleOutput();
		BookStore bookStore = new BookStore(new BookStoreHelper().createBooksList());
		BookStoreLogic bookStoreLogic = new BookStoreLogic();
		
		System.out.println("\tAll books:");
		output.printBooks(bookStore.getBooks());		
		
		System.out.println("===============================================================================");
		
		System.out.println("\tBooks by author:");
		output.printBooks(bookStoreLogic.showBooksByAuthor(bookStore, "Достоевский"));
		
		System.out.println("===============================================================================");
		
		System.out.println("\tBooks by publishing house:");
		output.printBooks(bookStoreLogic.showBooksByPublishingHouse(bookStore, "Аванта"));
		
		System.out.println("===============================================================================");
		
		System.out.println("\tBooks after given year:");
		output.printBooks(bookStoreLogic.showBooksAfterGivenYear(bookStore, 2000));
		
		
		
		

	}

}
