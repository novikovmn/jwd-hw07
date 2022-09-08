package by.epam.hw07.oop.task04;

import java.util.Comparator;

public class TrainByNumberComparator implements Comparator<Train> {

	@Override
	public int compare(Train t1, Train t2) {
		if (t1.getTrainNumber() > t2.getTrainNumber()) {
			return 1;
		} else if (t1.getTrainNumber() < t2.getTrainNumber()) {
			return -1;
		} else {
			return 0;
		}
	}

}
