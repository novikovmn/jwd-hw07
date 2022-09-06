package by.epam.hw07.oop.task10;

public class Airline {

	private static long numberOfFlight = 1;

	private String destinationPoint;
	private long flightNumber;
	private String planeName;
	private String departureTime;
	private DayOfWeek dayOfweek;

	public Airline(String destinationPoint, String planeName, String departureTime, DayOfWeek dayOfweek) {
		this.destinationPoint = destinationPoint;
		this.flightNumber = numberOfFlight++;
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
	public String toString() {
		return String.format("№%d, %s, %s, %s, " + dayOfweek.name(), flightNumber, destinationPoint, planeName,
				departureTime);
	}

}
