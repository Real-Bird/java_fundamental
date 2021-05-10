package java_20210507;

public class StaticMethodDemo {
	String name;
	static double interestRate;

	public void m1() {
		System.out.println("instance method m1() 호출");
	}

	public void m2() {
		// instance method에서는 모든 변수와 모든 메서드 호출 가능
		this.name = "김진영"; //this. => 자기 자신 인스턴스 // instance에는 this.이 생략되어 있음
		StaticMethodDemo.interestRate = 3.4; //static에는 클래스 네임.이 생략되어 있음
		this.m1();
		m3();
	}

	public static void m3() {
		System.out.println("instance method m3() 호출");
	}

	// public static void m4() {
	public static void m4() {
		// static method에서는 static 변수와 static 메서드만 호출 가능
		//name = "홍길동";
		interestRate = 4.3;
		//m1();
		m3();
		m3();
	}
	public static void main(String[] args) {
		StaticMethodDemo.m3();
		StaticMethodDemo.m4();
		StaticMethodDemo.interestRate = 4.3;
		StaticMethodDemo smd = new StaticMethodDemo();
		smd.name = "손오공";
		smd.m1();
		
	}
}
