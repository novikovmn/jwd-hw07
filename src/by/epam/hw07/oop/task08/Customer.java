package by.epam.hw07.oop.task08;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {

	private static final long serialVersionUID = -2541224035952378075L;

	private static long id = 1;

	private long customerId;
	private String lastName;
	private String firstName;
	private String patronymic;
	private String address;
	private long creditCardNumber;
	private long bankAccountNumber;

	public Customer() {
	}

	public Customer(String lastName, String firstName, String patronymic, String address) {
		this.customerId = id++;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.address = address;

		// для наглядности я так придумал
		this.creditCardNumber = this.customerId * 3;
		this.bankAccountNumber = this.creditCardNumber * 111;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, bankAccountNumber, creditCardNumber, customerId, firstName, lastName, patronymic);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && bankAccountNumber == other.bankAccountNumber
				&& creditCardNumber == other.creditCardNumber && customerId == other.customerId
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(patronymic, other.patronymic);
	}

	@Override
	public String toString() {
		return "Id = " + customerId + ", " +  lastName + " " + firstName
				+ " " + patronymic + ", " + address + ", cardNumber = " + creditCardNumber
				+ ", bankAccountNumber = " + bankAccountNumber;
	}

}
