package by.epam.hw07.oop.task04;

import java.util.Scanner;

public class TrainStation {

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
	public void sortTrainsByNumber() {
		boolean isSorted = false;

		while (!isSorted) {
			isSorted = true;

			for (int i = 0; i < trains.length - 1; i++) {
				if (trains[i].compareTo(trains[i + 1]) > 0) {
					isSorted = false;
					swapElements(trains, i, i + 1);
				}
			}

		}
	}

	/*
	 * sort trains by destination point
	 */
	public void sortTrainsByDestinationPoint() {

		boolean isSorted = false;

		while (!isSorted) {
			isSorted = true;

			for (int i = 0; i < trains.length - 1; i++) {
				if (trains[i].getDestinationPoint().compareTo(trains[i + 1].getDestinationPoint()) > 0) {
					isSorted = false;
					swapElements(trains, i, i + 1);

				}
			}

		}

	}

	/*
	 * sort trains by departure time
	 */
	public void sortTrainsByDepartureTime() {

		for (int i = 0; i < trains.length - 1; i++) {
			for (int j = i + 1; j < trains.length; j++) {
				if (trains[i].getDestinationPoint().equals(trains[j].getDestinationPoint())) {
					if (trains[i].getDepartureTime().compareTo(trains[j].getDepartureTime()) > 0) {
						swapElements(trains, i, j);
					}
				}
			}
		}

	}

	/*
	 * user need to enter the train number, and he will get info about it as a
	 * response
	 */
	public void showTrainInfoByNumber() {

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

		for (Train train : trains) {
			if (train.getTrainNumber() == inputnumber) {
				System.out.println(train);
			}
		}

	}

	/*
	 * swap elements/trains
	 */
	public static void swapElements(Train[] trains, int index1, int index2) {
		Train temp = trains[index1];
		trains[index1] = trains[index2];
		trains[index2] = temp;
	}

	/*
	 * print all trains
	 */
	public void printTrains() {
		for (Train train : trains) {
			System.out.println(train);
		}
	}

}
