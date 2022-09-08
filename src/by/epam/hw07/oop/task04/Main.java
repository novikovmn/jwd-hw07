package by.epam.hw07.oop.task04;

import java.util.List;

/* 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам 
поездов.  Добавьте  возможность  вывода  информации  о  поезде,  номер  которого  введен  пользователем.  
Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения 
должны быть упорядочены по времени отправления. */

public class Main {

	public static void main(String[] args) {

		TrainStation trainStation = new TrainStation(new TrainStationHelper().createTrainsList());

		System.out.println("\tAll trains:");
		for (Train train : trainStation.getTrains()) {
			System.out.println(train);
		}

		System.out.println("==========================================================================");
		
		/*
		 * user need to enter train number to show him info about it
		 * */
		
		int trainNumber = trainStation.getTrainNumberFromUser(); 
		for (Train train : trainStation.getTrains()) {
			if(train.getTrainNumber() == trainNumber) {
				System.out.println("Done! >>> " + train);
			}			
		}
		
		System.out.println("==========================================================================");

		System.out.println("\tTrains sorted by number:");
		for (Train train : trainStation.sortTrainsByNumber()) {
			System.out.println(train);
		}

		System.out.println("==========================================================================");

		System.out.println("\tTrains sorted by destination point and departure time:");
		List<Train> trainsByDestinationPoint = trainStation.sortTrainsByDestinationPoint();
		for (Train train : trainStation.sortTrainsByDepartureTime(trainsByDestinationPoint)) {
			System.out.println(train);
		}

	}

}
