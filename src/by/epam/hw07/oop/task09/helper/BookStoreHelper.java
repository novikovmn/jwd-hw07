package by.epam.hw07.oop.task09.helper;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw07.oop.task09.bean.Author;
import by.epam.hw07.oop.task09.bean.Binding;
import by.epam.hw07.oop.task09.bean.Book;

public class BookStoreHelper {

	public List<Book> createBooksList() {

		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "Воина и мир", new Author[] { new Author("Толстой", "Лев") }, "Аванта", 1996, 1200, 600.0,
				Binding.HARD));
		books.add(new Book(2, "Преступление и наказание", new Author[] { new Author("Достоевский", "Федор") }, "Азбука",
				1999, 750, 520.0, Binding.HARD));
		books.add(new Book(3, "Дракула", new Author[] { new Author("Стокер", "Брэм") }, "Арка", 2000, 600, 400.0,
				Binding.HARD));
		books.add(new Book(4, "Бойцовский клуб", new Author[] { new Author("Паланик", "Чак") }, "Арка", 1997, 300,
				350.0, Binding.SOFT));
		books.add(new Book(5, "Мертвые души", new Author[] { new Author("Гоголь", "Николай") }, "Вече", 2001, 600,
				700.0, Binding.HARD));
		books.add(new Book(6, "Бесы", new Author[] { new Author("Достоевский", "Федор") }, "Вече", 1995, 750, 420.0,
				Binding.HARD));
		books.add(new Book(7, "Уцелевший", new Author[] { new Author("Паланик", "Чак") }, "Аванта", 1990, 500, 200.0,
				Binding.SOFT));
		books.add(new Book(8, "Удушье", new Author[] { new Author("Паланик", "Чак") }, "Литера", 1998, 500, 200.0,
				Binding.SOFT));
		books.add(new Book(9, "Яма", new Author[] { new Author("Берт", "Гай") }, "Аванта", 1991, 270, 120.0,
				Binding.SOFT));
		books.add(new Book(10, "Солярис", new Author[] { new Author("Лем", "Станислав") }, "Аванта", 1986, 500, 600.0,
				Binding.HARD));

		return books;
	}

}
