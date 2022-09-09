package by.epam.hw07.oop.task03.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw07.oop.task03.bean.Faculty;
import by.epam.hw07.oop.task03.bean.Student;

public class FacultyLogic {

	private static final int NINE = 9;
	private static final int TEN = 10;

	/*
	 * check if student have only nines or only tens
	 */

	public static boolean checkMarksOfStudent(int[] marks) {
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
	
	/*
	 * show students with only nines or only tens
	 * */
	public List<Student> studentsFilterByMarks(Faculty faculty) {
		List<Student> studs = new ArrayList<>();
		for (Student student : faculty.getStudents()) {
			if (checkMarksOfStudent(student.getMarks())) {
				studs.add(student);
			}
		}		
		return studs;
	}

}
