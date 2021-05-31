package java_20210531;

public class Exam {
	int a;
	int b;
	
	
	
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Exam(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}




	public void run(int a, int b) {
		try {
			int avg = (a + b) / 2;
			System.out.println("평균 : " + avg + "점");
		} catch (Exception e) {
			System.out.println("숫자 부족!");
		}
	}
}
