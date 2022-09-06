package by.epam.hw07.oop.task09;

public class BookStoreHelper {

	private static final int LENGTH = 10;

	public Book[] createBooksList() {
		Book[] books = new Book[LENGTH];
		books[0] = new Book("Воина и мир", new Author[] { new Author("Толстой", "Лев") }, "Аванта", 1996, 1200, 600.0,
				Binding.HARD);
		books[1] = new Book("Преступление и наказание", new Author[] { new Author("Достоевский", "Федор") }, "Азбука",
				1999, 750, 520.0, Binding.HARD);
		books[2] = new Book("Дракула", new Author[] { new Author("Стокер", "Брэм") }, "Арка", 2000, 600, 400.0,
				Binding.HARD);
		books[3] = new Book("Бойцовский клуб", new Author[] { new Author("Паланик", "Чак") }, "Арка", 1997, 300, 350.0,
				Binding.SOFT);
		books[4] = new Book("Мертвые души", new Author[] { new Author("Гоголь", "Николай") }, "Вече", 2001, 600, 700.0,
				Binding.HARD);
		books[5] = new Book("Бесы", new Author[] { new Author("Достоевский", "Федор") }, "Вече", 1995, 750, 420.0,
				Binding.HARD);
		books[6] = new Book("Уцелевший", new Author[] { new Author("Паланик", "Чак") }, "Аванта", 1990, 500, 200.0,
				Binding.SOFT);
		books[7] = new Book("Удушье", new Author[] { new Author("Паланик", "Чак") }, "Литера", 1998, 500, 200.0,
				Binding.SOFT);
		books[8] = new Book("Яма", new Author[] { new Author("Берт", "Гай") }, "Аванта", 1991, 270, 120.0,
				Binding.SOFT);
		books[9] = new Book("Солярис", new Author[] { new Author("Лем", "Станислав") }, "Аванта", 1986, 500, 600.0,
				Binding.HARD);

		return books;
	}

}
