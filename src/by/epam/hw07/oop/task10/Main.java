package by.epam.hw07.oop.task10;

import by.epam.hw07.oop.task10.bean.Airport;
import by.epam.hw07.oop.task10.bean.DayOfWeek;
import by.epam.hw07.oop.task10.helper.AirportHelper;
import by.epam.hw07.oop.task10.logic.AirportLogic;
import by.epam.hw07.oop.task10.view.ConsoleOutput;

/*
 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
метод    toString().  Создать  второй  класс,  агрегирующий  массив  типа  Airline,  с  подходящими  конструкторами  и 
методами. Задать критерии выбора данных и вывести эти данные на консоль.  
 
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.  
	Найти и вывести:  
a) список рейсов для заданного пункта назначения;  
b) список рейсов для заданного дня недели;  
c) список рейсов для заданного дня недели, время вылета для которых больше заданного. 

 * */

public class Main {

	public static void main(String[] args) {

		ConsoleOutput output = new ConsoleOutput();
		Airport airport = new Airport(new AirportHelper().createAirlinesList());
		AirportLogic airportLogic = new AirportLogic();

		System.out.println("\tAll airlines:");
		output.printAirlines(airport.getAirlines());

		System.out.println("==================================================================");

		System.out.println("\tAirliners by destination point:");
		output.printAirlines(airportLogic.showAirlinesByDestinationPoint(airport, "Oslo"));

		System.out.println("==================================================================");

		System.out.println("\tAirliners by day of week:");
		output.printAirlines(airportLogic.showAirlinesByDayOfWeek(airport, DayOfWeek.FRIDAY));

		System.out.println("==================================================================");

		System.out.println("\tAirliners by given day and after given time:");
		output.printAirlines(airportLogic.showAirlinesByGivenDayOfWeekAndAfterGivenTime(airport, DayOfWeek.FRIDAY, "01:00"));

	}

}
