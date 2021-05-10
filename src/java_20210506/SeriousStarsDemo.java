package java_20210506;

public class SeriousStarsDemo {

	public static void main(String[] args) {
		
		char[] c1 = new char[4];
		
		// 내림차순 별 그리기
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

		// 오름차순 별 그리기
		for (int i = 0; i < c1.length + 1; i++) {
			for (int j = c1.length - 1 ; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
