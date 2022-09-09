package by.epam.hw07.oop.task10.bean;

import java.io.Serializable;
import java.util.Objects;

public class Airline implements Serializable {

	private static final long serialVersionUID = 1881864247232396691L;

	private String destinationPoint;
	private long flightNumber;
	private String planeName;
	private String departureTime;
	private DayOfWeek dayOfweek;

	public Airline() {
	}

	public Airline(String destinationPoint, long flightNumber, String planeName, String departureTime,
			DayOfWeek dayOfweek) {
		this.destinationPoint = destinationPoint;
		this.flightNumber = flightNumber;
		this.planeName = planeName;
		this.departureTime = departureTime;
		this.dayOfweek = dayOfweek;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public DayOfWeek getDayOfweek() {
		return dayOfweek;
	}

	public void setDayOfweek(DayOfWeek dayOfweek) {
		this.dayOfweek = dayOfweek;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dayOfweek, departureTime, destinationPoint, flightNumber, planeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return dayOfweek == other.dayOfweek && Objects.equals(departureTime, other.departureTime)
				&& Objects.equals(destinationPoint, other.destinationPoint) && flightNumber == other.flightNumber
				&& Objects.equals(planeName, other.planeName);
	}

	@Override
	public String toString() {
		return String.format("№%d, %s, %s, %s, " + dayOfweek.name(), flightNumber, destinationPoint, planeName,
				departureTime);
	}

}
