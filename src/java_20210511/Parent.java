package java_20210511;

public class Parent {
	String name;
	String address;
	int age;
	
	public Parent() {
		super();
	}

	public Parent(String name, String address, int age) {
		//생성자 안에는 super();가 반드시 있음. 가슴 속에 열정을 품고, 머리 속에 냉정을 담고, 생성자 안에는 super();가 있음을 기억하라.
		this.name = name;
		this.address = address;
		this.age = age;
	}
}
