package by.epam.hw07.oop.task09;

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
		
		BookStore bookStore = new BookStore(new BookStoreHelper().createBooksList());
		
		System.out.println("\tAll books:");
		bookStore.printBooks();
		
		System.out.println("===============================================================================");
		
		System.out.println("\tBooks by author:");
		bookStore.showBooksByAuthor("Достоевский");
		
		System.out.println("===============================================================================");
		
		System.out.println("\tBooks by publishing house:");
		bookStore.showBooksByPublishingHouse("Аванта");
		
		System.out.println("===============================================================================");
		
		System.out.println("\tBooks after given year:");
		bookStore.showBooksAfterGivenYear(1997);
		
		
		
		

	}

}
