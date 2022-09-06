package by.epam.hw07.oop.task03;

/* 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из 
пяти  элементов).  Создайте  массив  из  десяти  элементов  такого  типа.  Добавьте  возможность  вывода  фамилий  и 
номеров групп студентов, имеющих оценки, равные только 9 или 10. 
 */

public class Main {

	public static void main(String[] args) {

		Student[] students = { new Student("Ivanov", 1, new int[] { 4, 9, 7, 6, 4 }),
				new Student("Sidorov", 1, new int[] { 9, 9, 9, 9, 9 }),
				new Student("Petrov", 3, new int[] { 7, 8, 7, 3, 4 }),
				new Student("Pushkin", 5, new int[] { 10, 10, 10, 10, 10 }),
				new Student("Sigal", 2, new int[] { 6, 8, 7, 9, 1 }),
				new Student("Bellic", 4, new int[] { 7, 7, 7, 7, 7 }),
				new Student("Lermontov", 4, new int[] { 10, 10, 10, 10, 10 }),
				new Student("Lomonosov", 3, new int[] { 9, 9, 9, 9, 9 }),
				new Student("Bulgakov", 5, new int[] { 8, 8, 8, 8, 8 }),
				new Student("Gibson", 1, new int[] { 8, 9, 7, 7, 7 }) 
		};

		Faculty faculty = new Faculty(students);

		faculty.printStudents();

		faculty.studentsFilterByMarks(students);

	}
	
	

}
