package by.epam.hw07.oop.task09;

public class Author {

	private String lastName;
	private String firstName;

	public Author(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
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

	@Override
	public String toString() {		
		return String.format("%s %s", lastName, firstName);
	}
	
	

}
