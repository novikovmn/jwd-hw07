package by.epam.hw07.oop.task06;

public class Time {

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
		minutes = minutes + (seconds / 60);
		seconds = seconds % 60;
		hours = hours + (minutes / 60);
	}
	
	public void addMinutes(int min) {
		minutes = minutes + min;
		hours = hours + (minutes / 60);
		minutes = minutes % 60;		
	}
	
	public void addHours(int hh) {
		hours  = hours +  hh;
		hours = hours % 24;
	}

	public void setHours(int hours) {
		if (hours < 0 || hours > 23) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
	}

	public void setMinutes(int minutes) {
		if (minutes < 0 || minutes > 59) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
	}

	public void setSeconds(int seconds) {
		if (seconds < 0 || seconds > 59) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}

	@Override
	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}

}
