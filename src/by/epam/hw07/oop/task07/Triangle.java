package by.epam.hw07.oop.task07;

public class Triangle {

	// sides
	private double ab;
	private double bc;
	private double ac;

	// coordinates
	private Coordinate coordA;
	private Coordinate coordB;
	private Coordinate coordC;

	public Triangle(Coordinate a, Coordinate b, Coordinate c) {
		this.coordA = a;
		this.coordB = b;
		this.coordC = c;
	}

	// calculate all sides 
	public void calcSides() {
		ab = calcSide(coordA, coordB);
		bc = calcSide(coordB, coordC);
		ac = calcSide(coordA, coordC);
	}

	// calculate distance between two coordinates (side of the triangle)
	public static double calcSide(Coordinate coord1, Coordinate coord2) {
		double firstStep = Math.pow(coord1.getX() - coord2.getX(), 2);
		double secondStep = Math.pow(coord1.getY() - coord2.getY(), 2);
		double thirdStep = firstStep + secondStep;
		double fourthStep = Math.sqrt(thirdStep);
		return fourthStep;
	}

	// find perimeter
	public double calcPerimeter() {
		return ab + bc + ac;
	}

	// find area of the triangle
	public double calcArea(double perimeter) {
		double p = perimeter / 2;
		return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
	}

	// find median intersection point
	public Coordinate medianIntersectionPoint() {
		double x = (coordA.getX() + coordB.getX() + coordC.getX()) / 3;
		double y = (coordA.getY() + coordB.getY() + coordC.getY()) / 3;
		return new Coordinate(x, y);
	}

	@Override
	public String toString() {
		return coordA + ", " + coordB + ", " + coordC;
	}

}
