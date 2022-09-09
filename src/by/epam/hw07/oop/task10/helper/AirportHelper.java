package by.epam.hw07.oop.task10.helper;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw07.oop.task10.bean.Airline;
import by.epam.hw07.oop.task10.bean.DayOfWeek;

public class AirportHelper {

	public List<Airline> createAirlinesList() {

		List<Airline> airlines = new ArrayList<>();

		airlines.add(new Airline("Minsk", 1, "TY-154", "06:31", DayOfWeek.FRIDAY));
		airlines.add(new Airline("Moscow", 2, "Boeng-747", "14:45", DayOfWeek.MONDAY));
		airlines.add(new Airline("Amsterdam", 3, "TY-116", "00:11", DayOfWeek.FRIDAY));
		airlines.add(new Airline("Oslo", 4, "A320", "16:00", DayOfWeek.WEDNESDAY));
		airlines.add(new Airline("Toronto", 5, "A111", "20:44", DayOfWeek.SUNDAY));
		airlines.add(new Airline("Oslo", 6, "A310", "23:42", DayOfWeek.TUESDAY));
		airlines.add(new Airline("Mexico", 7, "TY-116", "15:30", DayOfWeek.SUNDAY));
		airlines.add(new Airline("Vladivostok", 8, "A171", "17:10", DayOfWeek.SUNDAY));
		airlines.add(new Airline("Berlin", 9, "F310", "19:40", DayOfWeek.SUNDAY));

		return airlines;
	}

}
