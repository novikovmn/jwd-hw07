package by.epam.hw07.oop.task07;

/*7.  Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  вычисления 
площади, периметра и точки пересечения медиан.  */

public class Main {

	public static void main(String[] args) {

		Coordinate coordA = new Coordinate(2, 2);
		Coordinate coordB = new Coordinate(5, 6);
		Coordinate coordC = new Coordinate(11, 2);

		Triangle triangle = new Triangle(coordA, coordB, coordC);

		triangle.calcSides();

		double perimeter = triangle.calcPerimeter();
		double area = triangle.calcArea(perimeter);
		Coordinate intersectionPoint = triangle.medianIntersectionPoint();

		System.out.println("\tWe have triangle with coords: " + triangle);
		System.out.println("Then:");
		System.out.printf("\tits perimeter = %.2f\n", perimeter);
		System.out.printf("\tits area = %.2f\n", area);
		System.out.println("And:");
		System.out.println("\tits median intersection point's coords: " + intersectionPoint);

	}

}
