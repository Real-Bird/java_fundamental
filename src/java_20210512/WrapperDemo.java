package java_20210512;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		// ctrl + shift + o => auto import
		// 자바 1.4 이전 버전에서는 primitive data type을 Collection에 저장할 수 었었기 때문에
		// primitive data type을 객체화 할 수 있는 Wrapper Class로 변환하여 저장해야 했음.
		ArrayList list = new ArrayList();
		// 아래와 같이 1을 저장할 수 없음.
		list.add(1);
		list.add(new Integer(1));

		// 1. primitive data type => wrapper class 변환(생성자 이용) - valueOf()
		Integer i1 = Integer.valueOf(10);
		Integer i2 = Integer.valueOf("20");
		
		//int i3 = i1 + i2; //i1과 i2는 reference(class) type으로 더하기 불가
		// 2. wrapper class => primitive data type 변환 - intValue()
		int i3 = i1.intValue();
		int i4 = i2.intValue();
		
		int i5 = i3 + i4;
		
		//숫자로 구성된 String => primitive data type 변환 - Integer.parseInt("String")
		String s1 = "12345";
		int i6 = Integer.parseInt(s1);
		
		//4. auto-boxing : primitive data type -> wrapper class 자동 형변환
		Integer i7 = 100; // Integer.valueOf() 생략
		Integer i8 = 200;
		
		// 5. auto-unboxing : wrapper class -> primitive data type 자동 형변환
		int i9 = i7 + i8; // intValue() 생략
		
	}
}
