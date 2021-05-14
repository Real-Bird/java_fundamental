package java_20210514;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random rand = new Random(1);
		Random rand2 = new Random(2);
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ":" + rand.nextInt());
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ":" + rand2.nextInt());
		}

		int[] number = new int[1000];
		int[] counter = new int[45];

		for (int i = 0; i < number.length; i++) {
			number[i] = rand.nextInt(45);
		}
		System.out.println();

		for (int i = 0; i < number.length; i++)
			counter[number[i]]++;

		for (int i = 0; i < counter.length; i++)
			System.out.println(i+1 + "의 개수" + printGraph('#', counter[i]) + " " + counter[i]);

	}

	public static String printGraph(char ch, int value) {
		char[] bar = new char[value];
		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar);

	}
}
