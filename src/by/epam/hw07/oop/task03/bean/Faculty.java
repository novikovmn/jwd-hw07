package by.epam.hw07.oop.task03.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty implements Serializable {

	private static final long serialVersionUID = 8801013552448648119L;

	private List<Student> students;

	public Faculty() {
		students = new ArrayList<>();
	}

	public Faculty(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public int hashCode() {
		return Objects.hash(students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		return Objects.equals(students, other.students);
	}

	@Override
	public String toString() {
		return "Faculty [students=" + students + "]";
	}

}
