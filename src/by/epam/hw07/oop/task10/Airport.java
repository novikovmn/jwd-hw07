package by.epam.hw07.oop.task10;

import java.util.Arrays;

public class Airport {

	private Airline[] airlines;

	public Airport(Airline[] airlines) {
		this.airlines = airlines;
	}

	public Airline[] getAirlines() {
		return airlines;
	}

	public void setAirlines(Airline[] airlines) {
		this.airlines = airlines;
	}

	public void printAirlines() {
		for (Airline airline : airlines) {
			System.out.println(airline);
		}
	}

	public void showAirlinesByGivenDayOfWeekAndAfterGivenTime(DayOfWeek dayOfWeek, String time) {

		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i].getDayOfweek().name().equals(dayOfWeek.name())) {
				if (airlines[i].getDepartureTime().compareTo(time) > 1) {
					System.out.println(airlines[i]);
				}
			}
		}
	}

	public void showAirlinesByDayOfWeek(DayOfWeek dayOfWeek) {
		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i].getDayOfweek().name().equals(dayOfWeek.name())) {
				System.out.println(airlines[i]);
			}
		}
	}

	public void showAirlinesByDestinationPoint(String destPoint) {
		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i].getDestinationPoint().equals(destPoint)) {
				System.out.println(airlines[i]);
			}
		}
	}

	@Override
	public String toString() {
		return "Airport [airlines=" + Arrays.toString(airlines) + "]";
	}

}
