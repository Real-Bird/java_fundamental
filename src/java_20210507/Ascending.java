package java_20210507;

public class Ascending {

	public static void ascending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int k = array[i];
					array[i] = array[j];
					array[j] = k;
				}
			}
			
		}
		for (int value:array) {
			System.out.printf(value + "\t");
		}
		System.out.println();
		
	}
	
}
