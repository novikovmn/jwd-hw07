package by.epam.hw07.oop.task08;

import by.epam.hw07.oop.task08.bean.CustomerDB;
import by.epam.hw07.oop.task08.helper.CustomerDBHelper;
import by.epam.hw07.oop.task08.logic.CustomerDBLogic;
import by.epam.hw07.oop.task08.view.ConsoleOutput;

/* 
	8. Создать класс Customer, спецификация которого приведена ниже. 
	Определить конструкторы, set- и get- методы и метод  toString().  
	Создать второй класс, агрегирующий массив типа  Customer, с подходящими конструкторами и методами. 
	Задать критерии выбора данных и вывести эти данные на консоль.   
	Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  
		Найти и вывести:  
	a) список покупателей в алфавитном порядке;  
	b) список покупателей, у которых номер кредитной карточки находится в заданном интервале 
 
 */

public class Main {

	public static void main(String[] args) {
		
		ConsoleOutput output = new ConsoleOutput();
		CustomerDB customerDB = new CustomerDB(new CustomerDBHelper().createCustomersList());		
		CustomerDBLogic customerDBLogic = new CustomerDBLogic();
		
		System.out.println("\tAll customers:");
		output.printCustomers(customerDB.getCustomers());
		
		System.out.println("===========================================================");

		System.out.println("\tCustomers by last name:");
		output.printCustomers(customerDBLogic.sortByLastName(customerDB));
		
		System.out.println("===========================================================");
		
		System.out.println("\tCustomers by credit card number:");
		output.printCustomers(customerDBLogic.getCustomersByCreditCardNumber(customerDB, 15, 17));
		
	}

}
