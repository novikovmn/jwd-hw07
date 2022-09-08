package by.epam.hw07.oop.task03;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Student implements Serializable {

	private static final long serialVersionUID = 535417504164904910L;

	private static final int LENGTH = 5;
	private static final int NINE = 9;
	private static final int TEN = 10;

	private String lastName;
	private int groupNumber;
	private int[] marks = new int[LENGTH];

	public Student() {
	}

	public Student(String lastName, int groupNumber, int[] marks) {
		this.lastName = lastName;
		this.groupNumber = groupNumber;
		this.marks = marks;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	/*
	 * check if student have only nines or only tens
	 */

	public boolean checkMarks(int[] marks) {

		int lenght = marks.length;

		int countNines = 0;
		int countTens = 0;

		for (int i = 0; i < marks.length; i++) {

			if (marks[i] == NINE) {
				countNines++;
			}

			if (marks[i] == TEN) {
				countTens++;
			}

		}

		return (countNines == lenght || countTens == lenght) ? true : false;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + Objects.hash(groupNumber, lastName);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return groupNumber == other.groupNumber && Objects.equals(lastName, other.lastName)
				&& Arrays.equals(marks, other.marks);
	}

	@Override
	public String toString() {
		return String.format("%s, group %d, " + " marks: " + Arrays.toString(marks), lastName, groupNumber);
	}

}
