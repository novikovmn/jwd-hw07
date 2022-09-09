package by.epam.hw07.oop.task08.view;

import java.util.List;

import by.epam.hw07.oop.task08.bean.Customer;

public class ConsoleOutput {
	
	public void printCustomers(List<Customer> customers) {
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

}
