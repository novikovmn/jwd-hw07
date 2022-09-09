package by.epam.hw07.oop.task08.comparator;

import java.util.Comparator;

import by.epam.hw07.oop.task08.bean.Customer;

public class CustomerLastNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {

		if (c1.getLastName().compareTo(c2.getLastName()) > 0) {
			return 1;
		} else if (c1.getLastName().compareTo(c2.getLastName()) < 0) {
			return -1;
		} else {
			return 0;
		}

	}

}
