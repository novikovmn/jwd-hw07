package by.epam.hw07.oop.task04.view;

import java.util.List;

import by.epam.hw07.oop.task04.bean.Train;

public class ConsoleOutput {
	
	public void printTrains(List<Train> trains) {
		for (Train train : trains) {
			System.out.println(train);
		}
	}
	
	public void printTrains(List<Train> trains, int trainNumber) {
		for (Train train : trains) {
			if (train.getTrainNumber() == trainNumber) {
				System.out.println(train);
			}
		}
	}

}
