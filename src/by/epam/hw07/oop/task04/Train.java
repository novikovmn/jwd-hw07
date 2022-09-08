package by.epam.hw07.oop.task04;

import java.io.Serializable;
import java.util.Objects;

public class Train implements Serializable {

	private static final long serialVersionUID = 7977899778798384302L;

	private String destinationPoint;

	// from 1 to 5 inclusively
	private int trainNumber;
	private String departureTime;

	public Train() {
	}

	public Train(String destinationPoint, int trainNumber, String departureTime) {
		this.destinationPoint = destinationPoint;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departureTime, destinationPoint, trainNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(departureTime, other.departureTime)
				&& Objects.equals(destinationPoint, other.destinationPoint) && trainNumber == other.trainNumber;
	}

	@Override
	public String toString() {
		return "Train to " + destinationPoint + ", №=" + trainNumber + ", at " + departureTime;
	}

}
