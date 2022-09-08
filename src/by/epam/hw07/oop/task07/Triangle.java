package by.epam.hw07.oop.task07;

import java.io.Serializable;
import java.util.Objects;

public class Triangle implements Serializable {

	private static final long serialVersionUID = -9150516028001651144L;

	// sides
	private double ab;
	private double bc;
	private double ac;

	// coordinates
	private Coordinate coordA;
	private Coordinate coordB;
	private Coordinate coordC;

	public Triangle() {
	}

	public Triangle(Coordinate a, Coordinate b, Coordinate c) {
		this.coordA = a;
		this.coordB = b;
		this.coordC = c;
	}

	public double getAb() {
		return ab;
	}

	public void setAb(double ab) {
		this.ab = ab;
	}

	public double getBc() {
		return bc;
	}

	public void setBc(double bc) {
		this.bc = bc;
	}

	public double getAc() {
		return ac;
	}

	public void setAc(double ac) {
		this.ac = ac;
	}

	public Coordinate getCoordA() {
		return coordA;
	}

	public void setCoordA(Coordinate coordA) {
		this.coordA = coordA;
	}

	public Coordinate getCoordB() {
		return coordB;
	}

	public void setCoordB(Coordinate coordB) {
		this.coordB = coordB;
	}

	public Coordinate getCoordC() {
		return coordC;
	}

	public void setCoordC(Coordinate coordC) {
		this.coordC = coordC;
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
	public int hashCode() {
		return Objects.hash(ab, ac, bc, coordA, coordB, coordC);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return Double.doubleToLongBits(ab) == Double.doubleToLongBits(other.ab)
				&& Double.doubleToLongBits(ac) == Double.doubleToLongBits(other.ac)
				&& Double.doubleToLongBits(bc) == Double.doubleToLongBits(other.bc)
				&& Objects.equals(coordA, other.coordA) && Objects.equals(coordB, other.coordB)
				&& Objects.equals(coordC, other.coordC);
	}

	@Override
	public String toString() {
		return coordA + ", " + coordB + ", " + coordC;
	}

}
