package java_20210511;

public class Sub extends Super {
	String chicken;
	public void gotoSchool() {
		System.out.println("Sub gotoSchool() 호출");
	}
	
	//overriding : 부모의 메서드를 재정의
	//작성 규칙
	//1) 반환형, 메서드 이름, 매개 변수 일치
	//2) 접근 한정자는 부모보다 자식이 상위이거나 같아야 함
	public void play(String starcraft) {
		//super.play("badook"); //부모의 원래 기능 호출
		System.out.println("Sub play(~) 호출");
	}
	
	public String toString() {
		return "Sub 클래스에서 오버라이딩한 toString()입니다.";
	}
}
