package java_20210503;

public class WhileDemo {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1; // 초기값
		while (i <= 10) { // 조건
			sum += i;
			i++; // 증감
		}
		/*
		 * int j = 1; 
		 * for(; j<=10;) {
		 *  sum += j; 
		 *  j++; 
		 *  }
		 */
		System.out.printf("1부터 10까지 합은 %d 입니다.", sum);

		// while 구구단
		int first = 2;
		while (first <= 9) {
			System.out.printf("%d 단입니다. %n", first);
			int second = 1;
			while (second <= 9) {
				System.out.printf("%d * %d = %d %n", first, second, first * second);
				second++;
			}
			first++;
		}

	}
}
