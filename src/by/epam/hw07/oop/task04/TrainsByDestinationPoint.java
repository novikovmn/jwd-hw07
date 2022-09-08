package by.epam.hw07.oop.task04;

import java.util.Comparator;

public class TrainsByDestinationPoint implements Comparator<Train>{

	@Override
	public int compare(Train t1, Train t2) {

		if (t1.getDestinationPoint().compareTo(t2.getDestinationPoint()) > 0) {
			return 1;
		} else if (t1.getDestinationPoint().compareTo(t2.getDestinationPoint()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
