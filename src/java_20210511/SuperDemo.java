package java_20210511;

class A{
	int a;
	A(int a){
		super();
		this.a = a;
	}
	A(){
		super();
	}
}

class B extends A{
	B(){
		super(10);
	}
}


public class SuperDemo {
	public static void main(String[] args) {
		B b = new B();
		
		System.out.println(b.a);
	}
}
