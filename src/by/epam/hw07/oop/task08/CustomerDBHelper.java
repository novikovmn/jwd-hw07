package by.epam.hw07.oop.task08;

import java.util.ArrayList;
import java.util.List;

public class CustomerDBHelper {

	List<Customer> createCustomersList() {
		List<Customer> customersList = new ArrayList<Customer>();
		customersList.add(new Customer("Иванов", "Иван", "Иванович", "Вязьма"));
		customersList.add(new Customer("Лермонтов", "Петр", "Иванович", "Владикавказ"));
		customersList.add(new Customer("Менделеев", "Сергей", "Алексеевич", "Тула"));
		customersList.add(new Customer("Петрова", "Маргарита", "Васильевна", "Минск"));
		customersList.add(new Customer("Чайковский", "Петр", "Ильич", "Санкт-Петербург"));
		customersList.add(new Customer("Каневский", "Леонид", "Леонидович", "Киев"));
		customersList.add(new Customer("Пушкин", "Александр", "Сергеевич", "Москва"));
		customersList.add(new Customer("Бездомный", "Иван", "Петрович", "Москва"));
		customersList.add(new Customer("Милославский", "Джордж", "Гайдаевич", "Казань"));
		customersList.add(new Customer("Шпак", "Андрей", "Игоревич", "Тбилиси"));
		return customersList;
	}

}
