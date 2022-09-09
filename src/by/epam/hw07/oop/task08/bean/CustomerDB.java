package by.epam.hw07.oop.task08.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerDB implements Serializable {

	private static final long serialVersionUID = -5117732284535178964L;

	private List<Customer> customers;

	public CustomerDB() {
		customers = new ArrayList<>();
	}

	public CustomerDB(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	/*
	 * add customer
	 */
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	/*
	 * remove customer
	 */
	public void removeCustomer(Customer customer) {
		customers.remove(customer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customers);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDB other = (CustomerDB) obj;
		return Objects.equals(customers, other.customers);
	}

	@Override
	public String toString() {
		return "CustomerDB [customers=" + customers + "]";
	}

}
