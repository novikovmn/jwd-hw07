package by.epam.hw07.oop.task05;

import java.util.Random;

/*
 * 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на 
единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и 
произвольными  значениями. Счетчик  имеет  методы  увеличения  и  уменьшения  состояния,  и  метод 
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса. 
*/

public class Main {

	public static void main(String[] args) {

		/*
		 * comment/uncomment the necessary !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 */

		// ==================example with random====================================

		System.out.println("Example with random:");

		Random random = new Random();
		Counter counter1 = new Counter(random);

		System.out.println("Value before decrease = " + counter1.getCurrentValue());
		counter1.decrease();
		counter1.decrease();
		System.out.println("Value after decrease = " + counter1.getCurrentValue());

//		System.out.println("Value before increase = " + counter1.getCurrentValue());
//		counter1.increase();
//		counter1.increase();
//		System.out.println("Value after increase = " + counter1.getCurrentValue());

		// ==========================================================================

		// =================example with default====================================

//		System.out.println("Example with default:");

//		Counter counter2 = new Counter();
//		
//		System.out.println("Value before decrease = " + counter2.getCurrentValue());
//		for (int i = 0; i < 3; i++) {
//			counter2.decrease();
//		}
//		System.out.println("Value after decrease = " + counter2.getCurrentValue());
//		
//		System.out.println("Value before increase = " + counter2.getCurrentValue());
//		for (int i = 0; i < 3; i++) {
//			counter2.increase();
//		}
//		System.out.println("Value after increase = " + counter2.getCurrentValue());		

		// ==========================================================================

		// ================example with manually entered value======================

//		System.out.println("Example with manually entered value:");

//		Counter counter3 = new Counter(5);
//		
//		System.out.println("Value before increase = " + counter3.getCurrentValue());
//		for (int i = 0; i < 6; i++) {
//			counter3.increase();
//		}		
//		System.out.println("Value after increase = " + counter3.getCurrentValue());
//		
//		System.out.println("Value before decrease = " + counter3.getCurrentValue());
//		for (int i = 0; i < 3; i++) {
//			counter3.decrease();
//		}		
//		System.out.println("Value after decrease= " + counter3.getCurrentValue());

		// ==========================================================================

	}

}
