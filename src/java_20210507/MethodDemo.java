package java_20210507;

public class MethodDemo {

	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean isLeafYear = isLeafYear(year);
		if (isLeafYear) {
			monthArray[1] = 29;
		}
		
		for (int i = 1; i <= monthArray[month - 1]; i++) {
			System.out.print(i + "\t");
			if (i % 7 == 0)
				System.out.println();
		}
	}


	public int[] ascending(int[] array) {
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

	public boolean isLeafYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	public int plus(int first, int second) { // first, second => 매개변수(parameter)
		return first + second;
	}

	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();

		int sum = m.plus(10, 20); // 10, 20 => 인자(arguments)

		System.out.printf("%d %n", sum);

		boolean leafYear = m.isLeafYear(400);

		System.out.printf("%s %n", leafYear);

		int[] test = { 10, 20, 1, 30, 4, 89, 100, 25 };

		int[] afterTest = m.ascending(test);
		for (int i = 0; i < afterTest.length; i++) {
			System.out.printf("%d" + "\t", afterTest[i]);
		}
		System.out.println();
		System.out.println();

		m.print(2020, 2);
	}
}