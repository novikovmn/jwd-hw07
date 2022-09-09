package by.epam.hw07.oop.task04.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TrainStation implements Serializable {
	
	private static final long serialVersionUID = 9216661977096834466L;
	
	private List<Train> trains;

	public TrainStation() {
		trains = new ArrayList<>();
	}

	public TrainStation(List<Train> trains) {
		this.trains = trains;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	
	/*
	 * add train
	 * */
	public void addTrain(Train train) {
		trains.add(train);
	}
	
	/*
	 * remove train
	 * */
	public void removeTrain(Train train) {
		trains.remove(train);
	}

	@Override
	public int hashCode() {
		return Objects.hash(trains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainStation other = (TrainStation) obj;
		return Objects.equals(trains, other.trains);
	}

	@Override
	public String toString() {
		return "TrainStation [trains=" + trains + "]";
	}

	
}
