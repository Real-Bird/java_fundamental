package java_20210507.aa;

public class Ascending {
	
	private int[] ascending(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int k = array[i];
					array[i] = array[j];
					array[j] = k;
				}
			}
			
		}
		return array;	
	}

	public void print(int[] array) {
		array = ascending(array);
		for (int i = 0; i < array.length; i++) {
			System.out.printf(array[i] + "\t");
		}
		System.out.println();
	}
	
}