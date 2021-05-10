package java_20210430;

public class CharLiteralDemo {
	public static void main(String[] args) {
		// char 리터럴 => 문자 표현법
		char c1 = '김';
		char c2 = '진';
		char c3 = '영';

		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		System.out.println();
		// char 리터럴 => 유니코드 표현법
		char c4 = '\uAE40';
		char c5 = '\uC9C4';
		char c6 = '\uC601';

		System.out.print(c4);
		System.out.print(c5);
		System.out.println(c6);
		System.out.println();

		// char 리터럴 => 아스키코드 표현법
		char c7 = 48;//0
		char c8 = 65;//A
		char c9 = 97;//a

		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		System.out.println();

		// ''';, '\'; 불가, 사용하려면 \ 붙임
		char c10 = '\'';// '
		char c11 = '\\';// \
		char c12 = '"'; // 사용 가능

		System.out.println(c10);
		System.out.println(c11);
		System.out.println(c12);
		System.out.println();

		String c13 = "'"; // 사용 가능
		// "\";, """; 불가, 사용하려면 \ 붙임
		String c14 = "\\";// \
		String c15 = "\"";// "
		System.out.println(c13);
		System.out.println(c14);
		System.out.println(c15);

		// 특수문자 \t(탭), \n(줄바꿈)
		System.out.print("Hello,\nI'm Jinyoung.\nNice to meet you.\n");
		System.out.print("\n");
		System.out.print("아이디\t\t이름\t지역\n");
		System.out.print("Real_Bird_Super\t김진영\t아산");

	}
}
