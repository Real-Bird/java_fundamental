package java_20210430;

public class IfDemo {
	public static void main(String[] args) {
		// Run Configurations => Arguments => Program arguments에 인자 입력
		int month = Integer.parseInt(args[0]);
		String season = "";
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month == 3 || month == 4 || month == 5) {
			season = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "겨울";
		} else {
			season = "없는 계절";
		}
		System.out.println(month + "월은 " + season + " 입니다.");

		// 교재 출력 방식
		int a = 125900;
		double d = 125234.789;
		String name = "김진영";

		System.out.printf("a는 %,d 입니다.%n", a);// printf는 print format의 약자
		System.out.printf("d는 %,.2f 입니다.%n", d);
		System.out.printf("저는 \"%s\", %,d, %,.2f 입니다.%n", name, a, d);

		int a1 = 100;
		String msg = "";
		if (a1 % 2 == 0) {
			msg = "짝수";
		} else {
			msg = "홀수";
		}
		System.out.println(msg);

		// 삼항 연산자(조건 연산자)
		msg = (a1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(msg);

	}
}
