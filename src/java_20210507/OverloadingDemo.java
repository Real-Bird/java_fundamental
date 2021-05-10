package java_20210507;

public class OverloadingDemo {
	//OverloadingDemo 클래스에서는 print() 메서드를 4가지로 오버로딩
	//overloading의 작성 규칙은
	//1. 같은 클래스 내에서
	//2. 메서드 이름은 같아야 함.
	//3. 매개변수 개수가 같으면 서로 다른 자료형으로 구현
	//4. 매개변수 개수가 달라야 함.
	//5. 접근 한정자와 반환형은 같거나 달라도 무방
	
	public void print(String str) {
		System.out.print(str);
	}
	public void print(int i) {
		System.out.print(i);
	}
	public void print(double d) {
		System.out.print(d);
	}
	public void print(boolean b) {
		System.out.print(b);
	}
	
	public static void main(String[] args) {
		OverloadingDemo demo = new OverloadingDemo();
		
		demo.print("김개똥");
		demo.print(10);
		demo.print(true);
		demo.print(42.34);
		
	}
	
}