package by.epam.hw07.oop.task03;

import by.epam.hw07.oop.task03.bean.Faculty;
import by.epam.hw07.oop.task03.helper.FacultyHelper;
import by.epam.hw07.oop.task03.logic.FacultyLogic;
import by.epam.hw07.oop.task03.view.ConsoleOutput;

/* 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из 
пяти  элементов).  Создайте  массив  из  десяти  элементов  такого  типа.  Добавьте  возможность  вывода  фамилий  и 
номеров групп студентов, имеющих оценки, равные только 9 или 10. 
 */

public class Main {

	public static void main(String[] args) {	

		ConsoleOutput output = new ConsoleOutput();
		
		Faculty faculty = new Faculty(new FacultyHelper().createStudentsList());
		
		FacultyLogic facultyLogic = new FacultyLogic();

		System.out.println("\tAll students:");
		output.printStudents(faculty.getStudents());		
		
		System.out.println("==========================================================");
		
		System.out.println("\tStudents with only nines or only tens:");		
		output.printStudents(facultyLogic.studentsFilterByMarks(faculty));
		
		
	}
	
	

}
