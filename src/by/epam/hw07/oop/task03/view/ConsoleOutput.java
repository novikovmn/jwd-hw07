package by.epam.hw07.oop.task03.view;

import java.util.List;

import by.epam.hw07.oop.task03.bean.Student;

public class ConsoleOutput {
	
	public void printStudents(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
