package by.epam.hw07.oop.task05;

import java.util.Random;

public class Counter {

	private static final int FROM = 0;
	private static final int TO = 10;

	private int from;
	private int to;
	private int value;

	/*
	 * intialization value by default
	 */
	public Counter() {
		from = FROM;
		to = TO;
		// value = 0
	}

	/*
	 * intialization by random value
	 */
	public Counter(Random random) {
		this();
		value = random.nextInt(TO);
	}

	/*
	 * intialization by value wich will be given
	 */
	public Counter(int value) {
		this();
		this.value = value;

		if (this.value > to) {
			this.value = to;
		}

		if (this.value < from) {
			this.value = from;
		}

	}

	/*
	 * increase value
	 */
	public void increase() {
		value++;

		if (value > to) {
			value = from + (value - to);
		}
	}

	/*
	 * decrease value
	 */
	public void decrease() {
		value--;

		if (value < from) {
			value = TO - (Math.abs(from - value));
		}
	}

	/*
	 * get value
	 */
	public int getCurrentValue() {
		return value;
	}

}
