package java_20210507;

public class Descending {
	public int[] descending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int k = array[i];
					array[i] = array[j];
					array[j] = k;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.printf(array[i] + "\t");
		}
		System.out.println();
		return array;
	}
}
