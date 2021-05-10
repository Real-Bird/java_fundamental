package java_20210503;

public class ForDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (int i1 = 1; i1 <= 10; i1++) {
			sum += i1;
		}
		System.out.printf("1부터 10까지 합은 %d 입니다.%n", sum);

		int sum2 = 0;
		for (int i2 = 2; i2 <= 10; i2 += 2) {
			sum2 += i2;
		}
		System.out.printf("1부터 10까지의 짝수 합은 %d 입니다.%n", sum2);
		
		int sum3 = 0;
		for (int i3 = 1; i3 <= 10; i3++) {
			if (i3 % 2 == 0) {
				sum3 += i3;
			}

		}
		System.out.printf("1부터 10까지의 짝수 합은 %d 입니다.%n", sum3);
		System.out.println();
		
		for (int first = 2; first <= 9; first++) {
			System.out.printf("%d단 입니다.%n", first);
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d %n", first, second, first*second);
				
			}
			
		}
		//1부터 100까지 합
		int sum4 = 0;
		for (int i4 = 1; i4 <= 100; i4++) {
			sum4 += i4;
			
		}
		System.out.println(sum4);

	}

}
