package by.epam.hw07.oop.task06;

/*6.  Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и 
изменения  его  отдельных  полей  (час,  минута,  секунда) с  проверкой  допустимости  вводимых  значений.  В  случае 
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное 
количество часов, минут и секунд.*/

public class Main {

	public static void main(String[] args) {

		Time time = new Time(5, 47, 53);

		System.out.println("Before: " + time);

		time.addSeconds(7);
//		time.addMinutes(13);		
//		time.addHours(20);

		System.out.println("After: " + time);

	}

}
