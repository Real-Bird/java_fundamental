// 패키지명도 식별자에 포함되기 때문에 식별자 규칙 지켜야 함.(규칙)
package java_20210429;
// 클래스명도 식별자에 포함.(규칙)
// 클래스명의 첫 글자는 대문자, 합성어의 경우 두 번째 단어 첫 글자 역시 대문자.(관례)
public class IdentifierDemo {
	// 매서드명도 식별자에 포함.(규칙)
	// 클래스명을 제외한 모든 이름은 소문자.(관례)
	public static void main(String[] agrs) {
		int age = 20;
		String name = "hello";
		// 첫 글자에 숫자 사용 불가
		//String 1fatherName = "john";
		// 공백 사용 불가
		//String mother Name = "Michell";
		// 예약어 사용 불가
		//String void = "empty";
		
		// 자바는 유니코드, 유니코드에 등록된 모든 언어 사용 가능(아랍어, 중국어는 일부만)
		// 하지만 안 쓰는 게 좋음
		String 이름 = "김진영";
		float b1 = 24.4f;
		float b11 = 24.4F;
		double b2 = 24.4;
		double b3 = 24.4d;
		double b4 = 24.4D;
		System.out.printf("%s, %s, %d %n", name, 이름, age);
		System.out.printf("%f, %f, %f, %f, %f", b1, b11, b2, b3, b4);
		

	}
}
