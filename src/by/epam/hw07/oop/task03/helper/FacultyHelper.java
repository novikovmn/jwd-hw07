package by.epam.hw07.oop.task03.helper;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw07.oop.task03.bean.Student;

public class FacultyHelper {

	public List<Student> createStudentsList() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ivanov", 1, new int[] { 4, 9, 7, 6, 4 }));
		students.add(new Student("Sidorov", 1, new int[] { 9, 9, 9, 9, 9 }));
		students.add(new Student("Petrov", 3, new int[] { 7, 8, 7, 3, 4 }));
		students.add(new Student("Pushkin", 5, new int[] { 10, 10, 10, 10, 10 }));
		students.add(new Student("Sigal", 2, new int[] { 6, 8, 7, 9, 1 }));
		students.add(new Student("Bellic", 4, new int[] { 7, 7, 7, 7, 7 }));
		students.add(new Student("Lermontov", 4, new int[] { 10, 10, 10, 10, 10 }));
		students.add(new Student("Lomonosov", 3, new int[] { 9, 9, 9, 9, 9 }));
		students.add(new Student("Bulgakov", 5, new int[] { 8, 8, 8, 8, 8 }));
		students.add(new Student("Gibson", 1, new int[] { 8, 9, 7, 7, 7 }));
		return students;
	}

}
