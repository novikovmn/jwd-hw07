package by.epam.hw07.oop.task03;

import java.util.Arrays;

public class Faculty {

	private Student[] students;

	public Faculty(Student[] students) {
		this.students = students;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	/*
	 * print all students at faculty
	 * */
	public void printStudents() {
		System.out.println("\tAll students:");
		for (Student student : students) {
			System.out.printf("%s, group - %d, " + "marks: " + Arrays.toString(student.getMarks()) + "\n",
					student.getLastName(), student.getGroupNumber());
		}
		System.out.println("==========================================================");
	}

	/*
	 * show students and their groups, wich have only nines or only tens
	 * */
	public void studentsFilterByMarks(Student[] students) {
		System.out.println("\tResult, according to task's conditions:");
		for (Student student : students) {
			if (student.checkMarks(student.getMarks())) {
				System.out.printf("%s, group - %d\n", student.getLastName(), student.getGroupNumber());
			}
		}

	}

}
