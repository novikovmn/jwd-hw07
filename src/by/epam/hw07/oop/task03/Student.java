package by.epam.hw07.oop.task03;

public class Student {

	private String lastName;
	private int groupNumber;
	private int[] marks = new int[5];

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
	 * */

	public boolean checkMarks(int[] marks) {

		int lenght = marks.length;
		int nine = 9;
		int ten = 10;

		int countNines = 0;
		int countTens = 0;

		for (int i = 0; i < marks.length; i++) {

			if (marks[i] == nine) {
				countNines++;
			}

			if (marks[i] == ten) {
				countTens++;
			}

		}

		return (countNines == lenght || countTens == lenght) ? true : false;

	}

}
