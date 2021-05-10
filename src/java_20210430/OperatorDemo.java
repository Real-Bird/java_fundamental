package java_20210430;

public class OperatorDemo {
	public static void main(String[] args) {
		// 자료형이 같은면 ','로 한 줄 작성 가능
		int a = 10, b = 22;
		int c = 0;
		double d = 0.0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		c = a * b;
		System.out.println(c);

		c = b / a;
		System.out.println(c);

		// double이 int보다 큰 개념이므로 auto-casting
		d = (double) b / a;
		System.out.println(d);

		c = b % a;
		System.out.println(c);

		if (a % 2 == 0)/* 피연산자 a를 2로 나누어 몫이 0이라면 */ {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		// 복합대입 연산자

		a += b; // a = a+b
		System.out.println(a);

		// 증감 연산자
		// 단독으로 쓰일 때는 앞, 뒤 상관없음
		a++;
		++b;
		System.out.println(a);// 33
		System.out.println(b);// 23

		a = 10;// a를 10으로 초기화한다.
		// 대입 후 증가
		c = a++;
		System.out.println(c);

		a = 10;
		// 증가 후 대입
		c = ++a;
		System.out.println(c);

		// 비교 연산자
		a = 10;
		b = 20;
		boolean isSuccess = a > b;
		System.out.println(isSuccess);

		if (a > b) {
			System.out.println("a가 b보다 크다.");
		} else {
			System.out.println("a가 b보다 작다.");
		}
		d = 10.0;
		isSuccess = a == d;
		System.out.println(isSuccess);

		// 논리 연산자
		a = 10;
		b = 20;
		isSuccess = (a == b) && (++a == b++);// short circuit이 발생하면 뒤 연산자 생략
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);

		a = 10;
		b = 20;
		isSuccess = (a == b) || (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);

		a = 10;
		b = 20;
		isSuccess = a == b || ++a == b++ && a++ == ++b;
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);

		a = 10;
		b = 20;
		isSuccess = ++a == b++ && a++ == ++b;
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);

		a = 10;
		b = 10;
		isSuccess = a == b && a == b++;
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
	}
}