package by.epam.hw07.oop.task10.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import by.epam.hw07.oop.task10.bean.Airline;
import by.epam.hw07.oop.task10.bean.Airport;
import by.epam.hw07.oop.task10.bean.DayOfWeek;

public class AirportLogic {
	
	
	/*
	 * airlines by day of week and after given time
	 * */
	public List<Airline> showAirlinesByGivenDayOfWeekAndAfterGivenTime(Airport airport, DayOfWeek dayOfWeek, String time) {
		List<Airline> airlines = airport.getAirlines();
		List<Airline> airlinesByGivenDayOfWeekAndAfterGivenTime;
		
		airlinesByGivenDayOfWeekAndAfterGivenTime = airlines.stream()
				.filter(a -> a.getDayOfweek().name().equals(dayOfWeek.name()))
				.filter(a -> a.getDepartureTime().compareTo(time) > 0)
				.collect(Collectors.toList());
		
		return airlinesByGivenDayOfWeekAndAfterGivenTime;
	}

	/*
	 * airlines by day of week
	 * */
	public List<Airline> showAirlinesByDayOfWeek(Airport airport, DayOfWeek dayOfWeek) {
		List<Airline> airlines = airport.getAirlines();
		List<Airline> airlinesByDayOfWeek = new ArrayList<>();
		
		for (Airline airline : airlines) {
			if (airline.getDayOfweek().name().equals(dayOfWeek.name())) {
				airlinesByDayOfWeek.add(airline);
			}
		}
		
		return airlinesByDayOfWeek;
	}

	/*
	 * airlines by dest point
	 * */
	public List<Airline> showAirlinesByDestinationPoint(Airport airport, String destPoint) {
		List<Airline> airlines = airport.getAirlines();
		List<Airline> airlinesByDestinationPoint = new ArrayList<>();
		
		for (Airline airline : airlines) {
			if (airline.getDestinationPoint().equals(destPoint)) {
				airlinesByDestinationPoint.add(airline);
			}
		}
		
		return airlinesByDestinationPoint;
		
	}

}
