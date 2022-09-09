package by.epam.hw07.oop.task10.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airport implements Serializable {

	private static final long serialVersionUID = 524847779346243618L;

	private List<Airline> airlines;

	public Airport() {
		airlines = new ArrayList<>();
	}

	public Airport(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	/*
	 * add airline
	 */
	public void addAirline(Airline airline) {
		airlines.add(airline);
	}

	/*
	 * remove airline
	 */
	public void removeAirline(Airline airline) {
		airlines.remove(airline);

	}

	@Override
	public int hashCode() {
		return Objects.hash(airlines);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		return Objects.equals(airlines, other.airlines);
	}

	@Override
	public String toString() {
		return "Airport [airlines=" + airlines + "]";
	}

}
