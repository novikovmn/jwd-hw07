package by.epam.hw07.oop.task04.helper;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw07.oop.task04.bean.Train;

public class TrainStationHelper {

	public List<Train> createTrainsList() {
		List<Train> trains = new ArrayList<>();
		trains.add(new Train("Minsk", 4, "11:01"));
		trains.add(new Train("Gomel", 5, "12:00"));
		trains.add(new Train("Brest", 1, "03:14"));
		trains.add(new Train("Mogilev", 3, "16:51"));
		trains.add(new Train("Minsk", 2, "07:15"));
		return trains;
	}

}
