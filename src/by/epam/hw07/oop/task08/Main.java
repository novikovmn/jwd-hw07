package by.epam.hw07.oop.task08;

/* 
	8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
метод  toString().  Создать второй класс, агрегирующий массив типа  Customer, с подходящими конструкторами и 
методами. Задать критерии выбора данных и вывести эти данные на консоль.   
	Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  
	Найти и вывести:  
a) список покупателей в алфавитном порядке;  
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале 
 
 */

public class Main {

	public static void main(String[] args) {

		CustomerDB customerDB = new CustomerDB(new CustomerDBHelper().createCustomersList());

		System.out.println("\tSource data:");
		customerDB.printCustomers();

		System.out.println("==========================");

		System.out.println("\tSorted by last name:");
		customerDB.sortByLastName();
		customerDB.printCustomers();

		System.out.println("==========================");

		System.out.println("\tSorted by credit card number:");
		customerDB.sortByCreditCardNumber(0, 10);

	}

}
