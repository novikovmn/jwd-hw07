package by.epam.hw07.oop.task04;

import java.util.List;

import by.epam.hw07.oop.task04.bean.Train;
import by.epam.hw07.oop.task04.bean.TrainStation;
import by.epam.hw07.oop.task04.helper.TrainStationHelper;
import by.epam.hw07.oop.task04.logic.TrainStationLogic;
import by.epam.hw07.oop.task04.view.ConsoleOutput;

/* 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
	Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам 
поездов.  Добавьте  возможность  вывода  информации  о  поезде,  номер  которого  введен  пользователем.  
Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения 
должны быть упорядочены по времени отправления. */

public class Main {

	public static void main(String[] args) {
		
		ConsoleOutput output = new ConsoleOutput();
		TrainStation trainStation = new TrainStation(new TrainStationHelper().createTrainsList());		
		TrainStationLogic trainStationLogic = new TrainStationLogic();		

		System.out.println("\tAll trains:");
		output.printTrains(trainStation.getTrains());

		System.out.println("==========================================================================");
		
		/*
		 * user need to enter train number to show him info about it
		 * */
		
		int trainNumber = trainStationLogic.getTrainNumberFromUser(); 
		output.printTrains(trainStation.getTrains(), trainNumber); 
		
		System.out.println("==========================================================================");

		System.out.println("\tTrains sorted by number:");
		output.printTrains(trainStationLogic.sortTrainsByNumber(trainStation));

		System.out.println("==========================================================================");

		System.out.println("\tTrains sorted by destination point and departure time:");
		List<Train> trainsByDestinationPoint = trainStationLogic.sortTrainsByDestinationPoint(trainStation);
		output.printTrains(trainStationLogic.sortTrainsByDepartureTime(trainsByDestinationPoint)); 

	}

}
