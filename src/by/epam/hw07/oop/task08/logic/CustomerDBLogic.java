package by.epam.hw07.oop.task08.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw07.oop.task08.bean.Customer;
import by.epam.hw07.oop.task08.bean.CustomerDB;
import by.epam.hw07.oop.task08.comparator.CustomerLastNameComparator;

public class CustomerDBLogic {
	
	/*
	 * show customers with card number in range [from-to]
	 * */
	public List<Customer> getCustomersByCreditCardNumber(CustomerDB customerDB, long from, long to) {
		List<Customer> originalCustomers = customerDB.getCustomers();
		List<Customer> customersByCreditCardNumber = new ArrayList<>();

		for (int i = 0; i < originalCustomers.size(); i++) {
			if(originalCustomers.get(i).getCreditCardNumber() >= from &&
					originalCustomers.get(i).getCreditCardNumber() <= to) {
				customersByCreditCardNumber.add(originalCustomers.get(i));
			}
		}
		
		return customersByCreditCardNumber;
	}

	/*
	 * sort by last name
	 * */
	
	private static final CustomerLastNameComparator CUSTOMER_LAST_NAME_COMPARATOR = new CustomerLastNameComparator();
	
	public List<Customer> sortByLastName(CustomerDB customerDB) {
		List<Customer> customersByLastName = new ArrayList<>(customerDB.getCustomers());
		customersByLastName.sort(CUSTOMER_LAST_NAME_COMPARATOR);
		return customersByLastName;
	}
}
