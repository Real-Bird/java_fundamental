package java_20210429;

public class LiteralDemo {
	public static void main(String[] args) {
		//byte 범위를 넘어가면 컴파일에러 발생
		//byte b1 = 128;
		//정수형 리터럴(byte, short, int)은 2진수, 8진수, 10진수, 16진수 있음
		int a1 = 128;//10진수
		int a2 = 076;//8진수
		int a3 = 0x123;//16진수
		int a4 = 0b111;//2진수
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		//long 리터럴은 숫자 뒤에 l,L로 표기
		long a5 = 2200000000000000000l;
		
		//10진수를 표기할 때 3자리 단위로 '_' 사용 가능
		int a6 = 1_000_000;
		
		System.out.println(a5);
		System.out.println(a6);
		
		//float 리터럴은 소수점 뒤에 f, F로 표기함
		float f1 = 1234.43f;
		
		//double 리터럴은 소수점 뒤에 d, D로 표기함(생략 가능)
		double d1 = 1234.45;
		
		//boolean 리터럴은 true, false
		boolean isExited = false;
		
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(isExited);
		
		
	}
}