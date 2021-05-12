package java_20210512;
//인터페이스간의 상속은 extends 키워드 사용, 다중상속 가능
public interface InterA extends InterB, InterC{
	
	//인터페이스의 변수는 public static final 생략 가능
	public static final double PI = 3.14;
	//인터페이스의 접근 한정자를 붙이지 않으면 public 생략 가능
	//abstract 생략 가능
	public abstract void mA();
}
