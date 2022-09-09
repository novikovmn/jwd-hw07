package by.epam.hw07.oop.task08.helper;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw07.oop.task08.bean.Customer;

public class CustomerDBHelper {

	public List<Customer> createCustomersList() {
		List<Customer> customersList = new ArrayList<Customer>();
		customersList.add(new Customer(1, "Иванов", "Иван", "Иванович", "Вязьма", 11, 11111));
		customersList.add(new Customer(2,"Лермонтов", "Петр", "Иванович", "Владикавказ", 12, 22222));
		customersList.add(new Customer(3,"Менделеев", "Сергей", "Алексеевич", "Тула", 13, 33333));
		customersList.add(new Customer(4,"Петрова", "Маргарита", "Васильевна", "Минск", 14, 44444));
		customersList.add(new Customer(5,"Чайковский", "Петр", "Ильич", "Санкт-Петербург", 15, 55555));
		customersList.add(new Customer(6,"Каневский", "Леонид", "Леонидович", "Киев", 16, 66666));
		customersList.add(new Customer(7,"Пушкин", "Александр", "Сергеевич", "Москва", 17, 77777));
		customersList.add(new Customer(8,"Бездомный", "Иван", "Петрович", "Москва", 18, 88888));
		customersList.add(new Customer(9,"Милославский", "Джордж", "Гайдаевич", "Казань", 19, 99999));
		customersList.add(new Customer(10,"Шпак", "Андрей", "Игоревич", "Тбилиси", 20, 12121212));
		return customersList;
	}

}
