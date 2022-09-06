package by.epam.hw07.oop.task04;

/* 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам 
поездов.  Добавьте  возможность  вывода  информации  о  поезде,  номер  которого  введен  пользователем.  
Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения 
должны быть упорядочены по времени отправления. */

public class Main {

	public static void main(String[] args) {

		Train[] trains = { 
				new Train("Minsk", 4, "11:01"), 
				new Train("Gomel", 5, "12:00"),
				new Train("Brest", 1, "03:14"), 
				new Train("Mogilev", 3, "16:51"), 
				new Train("Minsk", 2, "07:15") 
		};

		TrainStation trainStation = new TrainStation(trains);

		System.out.println("\tAll trains:");
		trainStation.printTrains();

		System.out.println("==========================================================================");

//		System.out.println("\tSort by number:");
//		trainStation.sortTrainsByNumber();
//		trainStation.printTrains();

		System.out.println("==========================================================================");

//		System.out.println("\tSorted by destination point and departure time (if destination points are equals) :");
//		trainStation.sortTrainsByDestinationPoint();
//		trainStation.sortTrainsByDepartureTime();
//		trainStation.printTrains();

		System.out.println("==========================================================================");

//		trainStation.showTrainInfoByNumber();	

	}

}
