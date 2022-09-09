package by.epam.hw07.oop.task10.view;

import java.util.List;

import by.epam.hw07.oop.task10.bean.Airline;

public class ConsoleOutput {
	
	public void printAirlines(List<Airline> airlines) {
		for (Airline airline : airlines) {
			System.out.println(airline);
		}
	}

}
