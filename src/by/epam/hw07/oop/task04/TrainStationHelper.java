package by.epam.hw07.oop.task04;

public class TrainStationHelper {

	Train[] createTrainsList() {
		Train[] trains = { 
				new Train("Minsk", 4, "11:01"), 
				new Train("Gomel", 5, "12:00"),
				new Train("Brest", 1, "03:14"), 
				new Train("Mogilev", 3, "16:51"), 
				new Train("Minsk", 2, "07:15")
		};
		return trains;
	}

}
