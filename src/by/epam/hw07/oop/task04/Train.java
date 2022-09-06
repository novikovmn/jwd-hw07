package by.epam.hw07.oop.task04;

public class Train implements Comparable<Train>{
	
	private String destinationPoint;

	// from 1 to 5 inclusively
	private int trainNumber;

	private String departureTime;

	public Train(String destinationPoint, int trainNumber, String departureTime) { 
		this.destinationPoint = destinationPoint;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getDepartureTime() { 
		return departureTime;
	}

	public void setDepartureTime(String departureTime) { 
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return "Train [destinationPoint=" + destinationPoint + ", trainNumber=" + trainNumber + ", departureTime="
				+ departureTime + "]";
	}

	/*
	 * compare trains by number
	 * 
	 * */
	@Override
	public int compareTo(Train other) {
		
		if (trainNumber > other.getTrainNumber()) {
			return 1;
		} else if(trainNumber < other.getTrainNumber()) {
			return -1;
		}else {
			return 0;
		}
		
	}

	
	
	

}
