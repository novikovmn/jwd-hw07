package by.epam.hw07.oop.task04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainStation {

	private static final TrainByNumberComparator TRAIN_BY_NUMBER_COMPARATOR = new TrainByNumberComparator();
	private static final TrainsByDestinationPoint TRAINS_BY_DESTINATION_POINT = new TrainsByDestinationPoint();

	private Train[] trains;

	public TrainStation(Train[] trains) {
		this.trains = trains;
	}

	public Train[] getTrains() {
		return trains;
	}

	public void setTrains(Train[] trains) {
		this.trains = trains;
	}

	/*
	 * sort trains by number
	 */
	public List<Train> sortTrainsByNumber() {
		List<Train> trainsSortedByNumber = Arrays.stream(trains).sorted(TRAIN_BY_NUMBER_COMPARATOR)
				.collect(Collectors.toList());

		return trainsSortedByNumber;
	}

	/*
	 * sort trains by destination point
	 */
	public List<Train> sortTrainsByDestinationPoint() {
		List<Train> trainsSortedByDestinationPoint = Arrays.asList(trains);
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
			System.out.println(">>> ");

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
