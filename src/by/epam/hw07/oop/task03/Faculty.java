package by.epam.hw07.oop.task03;

import java.util.ArrayList;
import java.util.List;

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
	 * show students and their groups, wich have only nines or only tens
	 * */
	public List<Student> studentsFilterByMarks() {
		List<Student> studs = new ArrayList<>();
		for (Student student : students) {
			if (student.checkMarks(student.getMarks())) {
				studs.add(student);
			}
		}		
		return studs;
	}

}
