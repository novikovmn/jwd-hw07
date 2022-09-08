package by.epam.hw07.oop.task08;

import java.util.ArrayList;
import java.util.List;

public class CustomerDB {

	private static final CustomerLastNameComparator CUSTOMER_LAST_NAME_COMPARATOR = new CustomerLastNameComparator();

	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public CustomerDB(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Customer> sortByCreditCardNumber(long from, long to) {
		List<Customer> customersByCreditCardNumber = new ArrayList<>();
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getCreditCardNumber() >= from && customers.get(i).getCreditCardNumber() <= to) {
				customersByCreditCardNumber.add(customers.get(i));
			}
		}
		return customersByCreditCardNumber;
	}

	public void sortByLastName() {
		customers.sort(CUSTOMER_LAST_NAME_COMPARATOR);
	}

}
