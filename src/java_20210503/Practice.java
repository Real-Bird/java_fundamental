package java_20210503;

public class Practice {

	public static void main(String[] args) {
		//for 구구단 복습
		for (int first = 2; first <= 9; first++) {
			System.out.printf("%d단 입니다.%n", first);
			for(int second = 1 ; second <= 9; second++) {
				System.out.printf("%d * %d = %d %n", first, second, first * second);
				
			}
			System.out.println();
		}
		
		//for 소수 구하기 복습
		int PrimeNum = 0;
		int PrimeIndex = 0;
		
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					count++;
					break;
				}
				PrimeIndex++;
			}
			if (count == 0) {
				System.out.printf("%d" + " ", i);
				
				PrimeNum++;
			}
			PrimeIndex++;
		}
		System.out.println();
		System.out.println(PrimeNum);
		System.out.println(PrimeIndex);
		
		// for 별 그리기
		for (int l = 1; l <= 4; l++) {
			for (int s = 1; s <= l; s++) {
				System.out.print("*");
				
			}
			System.out.println();
			
				
			}
		System.out.println();
		// for 역순 별 그리기
		for (int ll = 0; ll < 6; ll++) {
			for (int ss = ll; ss < 6; ss++) {
				System.out.print("*");
				
				
			}
			System.out.println();
			
		}
		System.out.println();
		
		// for
		for (int ii = 4; ii >= 1; ii--) {
			for (int ss = ii; ss <= 4; ss++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
	}

}
