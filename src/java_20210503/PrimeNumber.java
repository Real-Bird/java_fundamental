package java_20210503;

public class PrimeNumber {
	public static void main(String[] args) {
		int totalCountOfPrimeNumber = 0;
		int totalIndex = 0;
		
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j*j <= i; j++) { //261
			//for (int j = 2; j < i; j++) { //4950
			//for (int j = 2; j <= i/2; j++) { //641
			//for (int j = 1; j <= i; j++) { //5148
			//for (int j = 2; j <= i; j++) { //5049
				if (i % j == 0) {
					count++;
					break; //1158
					
				}
				totalIndex++;
			}
			if (count==0) { //4950, 641, 261
			//if (count==2) { //5148
			//if (count==1) { //5049
				totalCountOfPrimeNumber++;
				System.out.printf(i + ", ");
			}
			totalIndex++;
		}
		System.out.println();
		System.out.println(totalCountOfPrimeNumber);
		System.out.println(totalIndex);
		
		
	}
}
