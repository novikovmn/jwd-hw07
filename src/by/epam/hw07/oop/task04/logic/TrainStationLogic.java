package by.epam.hw07.oop.task04.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.epam.hw07.oop.task04.bean.Train;
import by.epam.hw07.oop.task04.bean.TrainStation;
import by.epam.hw07.oop.task04.comparator.TrainByNumberComparator;
import by.epam.hw07.oop.task04.comparator.TrainsByDestinationPointComparator;

public class TrainStationLogic {
	
	/*
	 * sort trains by number
	 */
	private static final TrainByNumberComparator TRAIN_BY_NUMBER_COMPARATOR = new TrainByNumberComparator();
	
	public List<Train> sortTrainsByNumber(TrainStation trainStation) {		
		List<Train> trainsSortedByNumber = new ArrayList<>(trainStation.getTrains());
		trainsSortedByNumber.sort(TRAIN_BY_NUMBER_COMPARATOR);
		return trainsSortedByNumber;
	}

	/*
	 * sort trains by destination point
	 */
	private static final TrainsByDestinationPointComparator TRAINS_BY_DESTINATION_POINT = new TrainsByDestinationPointComparator();
	
	public List<Train> sortTrainsByDestinationPoint(TrainStation trainStation) {
		List<Train> trainsSortedByDestinationPoint = new ArrayList<>(trainStation.getTrains());
		trainsSortedByDestinationPoint.sort(TRAINS_BY_DESTINATION_POINT);
		return trainsSortedByDestinationPoint;
	}

	/*
	 * sort trains by departure time
	 */
	public List<Train> sortTrainsByDepartureTime(List<Train> trainsSortedByDestinationPoint) {
		for (int i = 0; i < trainsSortedByDestinationPoint.size() - 1; i++) {
			if (trainsSortedByDestinationPoint.get(i).getDestinationPoint()
					.equals(trainsSortedByDestinationPoint.get(i + 1).getDestinationPoint())) {
				if (trainsSortedByDestinationPoint.get(i).getDepartureTime()
						.compareTo(trainsSortedByDestinationPoint.get(i + 1).getDepartureTime()) > 0) {
					swapElements(trainsSortedByDestinationPoint, i, i + 1);
				}
			}
		}
		return trainsSortedByDestinationPoint;
	}

	/*
	 * swap elements/trains
	 */
	private static void swapElements(List<Train> trains, int index1, int index2) {
		Train temp = trains.get(index1);
		trains.set(index1, trains.get(index2));
		trains.set(index2, temp);
	}

	/*
	 * user need to enter the train number, and he will get info about it as a
	 * response
	 */
	public int getTrainNumberFromUser() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int inputnumber = 0;

		while (true) {

			System.out.println("Please, enter the train number (from 1 to 5): ");
			System.out.print(">>> ");

			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Your input is not an integer! Please try again.\n" + ">>>  ");
			}

			inputnumber = sc.nextInt();

			if (inputnumber >= 1 && inputnumber <= 5) {
				break;
			}

		}
		
		return inputnumber;

	}

}
