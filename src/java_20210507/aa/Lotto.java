package java_20210507.aa;

public class Lotto {
	public int[] array = new int[6];

	public int[] lottery() {

		for (int i = 0; i < array.length; i++) {
			int random = (int) (Math.random() * 45) + 1;
			array[i] = random;
			for (int j = 0; j < i; j++) {
				if (random == array[j]) {
					i--;
					break;
				}
			}
		}
		return array;
	}
}