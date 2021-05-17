package java_20210517;

import java.util.ArrayList;

public class ExceptionDemo {
	public static void main(String[] args) {
		// java.lang.NumberFormatException
		// 1111a => 예외처리
		int i = Integer.parseInt("1111a");
		System.out.println(i);
		/*
		 * Exception in thread "main" java.lang.NumberFormatException: For input string:"1111a" ③현 에러 최상위 에러 클래스 at
		 * java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
		 * at java.base/java.lang.Integer.parseInt(Integer.java:652)
		 * at java.base/java.lang.Integer.parseInt(Integer.java:770) ②에러 발생 메서드 
		 * at java_20210517.ExceptionDemo.main(ExceptionDemo.java:6) ①에러 발생 위치
		 */
		
		//int i = Integer.parseInt("12.34");
		//12.34 = > 예외처리가 아닌 코드 변경
		double d = Double.parseDouble("12.34");
		System.out.println(d);

		//java.lang.ArrayIndexOutOfBoundsException
		//배열의 범위를 벗어나면 발생하는 예외
		int[] a = {1, 2, 3, 4};
		//System.out.println(a[4]); 
		System.out.println(a[3]);
		
		//java.lang.IndexOutOfBoundsException
		//Collections에서 범위를 벗어나면 발생하는 예외
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(123); // auto-boxing
		//System.out.println(list.get(1));
		System.out.println(list.get(0));
		
		//java.lang.NullPointerException
		//객체 생성하지 않고 메서드 사용 시 발생하는 예외
		//String str = null;
		String str = "hello";
		System.out.println(str.length());
		
		//java.lang.ArithmeticException
		//부정, 불능에서 발생하는 예외 //0으로 나눌 수 없음
		int b = 10;
		//int c = 0;
		int c = 1;
		System.out.println(b/c);
	}
}
