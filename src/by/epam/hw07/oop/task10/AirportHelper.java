package by.epam.hw07.oop.task10;

public class AirportHelper {

	private static final int LENGHT = 9;

	public Airline[] createAirlinesList() {
		Airline[] airlines = new Airline[LENGHT];
		airlines[0] = new Airline("Minsk", "TY-154", "06:31", DayOfWeek.FRIDAY);
		airlines[1] = new Airline("Moscow", "Boeng-747", "14:45", DayOfWeek.MONDAY);
		airlines[2] = new Airline("Amsterdam", "TY-116", "00:11", DayOfWeek.FRIDAY);
		airlines[3] = new Airline("Oslo", "A320", "16:00", DayOfWeek.WEDNESDAY);
		airlines[4] = new Airline("Toronto", "A111", "20:44", DayOfWeek.SUNDAY);
		airlines[5] = new Airline("Oslo", "A310", "23:42", DayOfWeek.TUESDAY);
		airlines[6] = new Airline("Mexico", "TY-116", "15:30", DayOfWeek.SUNDAY);
		airlines[7] = new Airline("Vladivostok", "A171", "17:10", DayOfWeek.SUNDAY);
		airlines[8] = new Airline("Berlin", "F310", "19:40", DayOfWeek.SUNDAY);
		return airlines;
	}

}
