package by.epam.hw07.oop.task03;

/* 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из 
пяти  элементов).  Создайте  массив  из  десяти  элементов  такого  типа.  Добавьте  возможность  вывода  фамилий  и 
номеров групп студентов, имеющих оценки, равные только 9 или 10. 
 */

public class Main {

	public static void main(String[] args) {	

		Faculty faculty = new Faculty(new FacultyHelper().createStudentsList());

		System.out.println("\tAll students:");
		for (Student student : faculty.getStudents()) {
			System.out.println(student);
		}
		
		System.out.println("==========================================================");
		
		System.out.println("\tStudents with only nines or only tens:");
		for (Student student : faculty.studentsFilterByMarks()) {
			System.out.println(student);
		}
		
		
	}
	
	

}
