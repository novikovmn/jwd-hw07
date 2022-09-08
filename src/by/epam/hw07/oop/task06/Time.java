package by.epam.hw07.oop.task06;

import java.io.Serializable;
import java.util.Objects;

public class Time implements Serializable {

	private static final long serialVersionUID = 6436861812674022637L;

	private static final int MAX_FOR_SET_HOURS = 23;
	private static final int MAX_FOR_SET_MINUTES = 59;
	private static final int MAX_FOR_SET_SECONDS = 59;
	private static final int ZERO = 0;
	private static final int VALUE_FOR_MINUTES_AND_SECONDS = 60;
	private static final int DAY_VALUE = 24;

	private int hours;
	private int minutes;
	private int seconds;

	public Time() {

	}

	public Time(int hours, int minutes, int seconds) {
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}

	public void addSeconds(int sec) {
		seconds = seconds + sec;
		minutes = minutes + (seconds / VALUE_FOR_MINUTES_AND_SECONDS);
		seconds = seconds % VALUE_FOR_MINUTES_AND_SECONDS;
		hours = hours + (minutes / VALUE_FOR_MINUTES_AND_SECONDS);
	}

	public void addMinutes(int min) {
		minutes = minutes + min;
		hours = hours + (minutes / VALUE_FOR_MINUTES_AND_SECONDS);
		minutes = minutes % VALUE_FOR_MINUTES_AND_SECONDS;
	}

	public void addHours(int hh) {
		hours = hours + hh;
		hours = hours % DAY_VALUE;
	}

	public void setHours(int hours) {
		if (hours < ZERO || hours > MAX_FOR_SET_HOURS) {
			this.hours = ZERO;
		} else {
			this.hours = hours;
		}
	}

	public void setMinutes(int minutes) {
		if (minutes < ZERO || minutes > MAX_FOR_SET_MINUTES) {
			this.minutes = ZERO;
		} else {
			this.minutes = minutes;
		}
	}

	public void setSeconds(int seconds) {
		if (seconds < ZERO || seconds > MAX_FOR_SET_SECONDS) {
			this.seconds = ZERO;
		} else {
			this.seconds = seconds;
		}
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hours, minutes, seconds);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hours == other.hours && minutes == other.minutes && seconds == other.seconds;
	}

	@Override
	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}

}
