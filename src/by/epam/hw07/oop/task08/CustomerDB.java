package by.epam.hw07.oop.task08;

import java.util.List;

public class CustomerDB {

	private List<Customer> customers;

	public CustomerDB(List<Customer> customers) {
		this.customers = customers;
	}
	
	public void sortByCreditCardNumber(long from, long to) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getCreditCardNumber() >= from && customers.get(i).getCreditCardNumber() <= to) {
				System.out.println(customers.get(i));
			}
		}
	}
	
	public void sortByLastName() {
		customers.sort(new CustomerLastNameComparator());
	}

	public void printCustomers() {
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
