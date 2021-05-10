package java_20210510;

public class CallbyValueRefDemo {

	public static void ascending(int[] temp) {
		for (int i = 0; i < temp.length; i++) {
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[i] > temp[j]) {
					int k = temp[i];
					temp[i] = temp[j];
					temp[j] = k;
				}
			}
		}
	}

	public static void change(int i, int[] j) {
		i = 20;
		j[3] = 400;
	}

	public static void main(String[] args) {
		int i = 10;
		int[] j = { 1, 2, 3, 4 };
		System.out.println(i + "," + j[3]);
		change(i, j);
		System.out.println(i + "," + j[3]);

		int[] lotto = { 3, 5, 12, 45, 23, 1 };
		ascending(lotto);
		for (int value : lotto) {
			System.out.print(value + "\t");
		}
	}
}
