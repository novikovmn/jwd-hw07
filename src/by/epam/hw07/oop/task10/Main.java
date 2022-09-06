package by.epam.hw07.oop.task10;

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

		Airport airport = new Airport(new AirportHelper().createAirlinesList());

		System.out.println("\tAll airlines:");
		airport.printAirlines();

		System.out.println("==================================================================");

		System.out.println("\tAirliners by destination point:");
		airport.showAirlinesByDestinationPoint("Oslo");

		System.out.println("==================================================================");

		System.out.println("\tAirliners by day of week:");
		airport.showAirlinesByDayOfWeek(DayOfWeek.SUNDAY);

		System.out.println("==================================================================");

		System.out.println("\tAirliners by given day and after given time:");
		airport.showAirlinesByGivenDayOfWeekAndAfterGivenTime(DayOfWeek.FRIDAY, "01:00");

	}

}
