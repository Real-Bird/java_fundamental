package java_20210527;

public class MemberDtoDemo {
	public static void main(String[] args) {
		//MemberDto 인스턴스를 생성할 때 디폴트 생성자 호출
		//인스턴스 변수를 초기화 하지 않았기 때문에 기본값이 출력됨
		System.out.println("default constructor 인스턴스 초기화");
		MemberDto dto1 = new MemberDto();
		System.out.println(dto1.getNum());
		System.out.println(dto1.getName());
		System.out.println(dto1.getAddr());
		System.out.println();
		
		//디폴트 생성자로 MemberDto 인스턴스를 생성하면 인스턴스 변수를 초기화할 수 없기 때문에
		//아래와 같이 setXXX 메서드를 일일이 호출해야 함
		System.out.println("default constructor 인스턴스 초기화 후 매개변수 할당");
		MemberDto dto2 = new MemberDto();
		dto2.setNum(1);
		dto2.setName("Shine");
		dto2.setAddr("Argen");
		System.out.println(dto2.getNum());
		System.out.println(dto2.getName());
		System.out.println(dto2.getAddr());
		System.out.println();
		
		//MemberDto 인스턴스를 생성할 때 매개변수 3개 짜리 생성자를 호출함
		//MemberDto 인스턴스가 생성될 때 인스턴스 변수 초기화 가능
		System.out.println("인자 3개 constructor 초기화");
		MemberDto dto3 = new MemberDto(1, "Shine", "Argen");
		System.out.println(dto3.getNum());
		System.out.println(dto3.getName());
		System.out.println(dto3.getAddr());
	}
}
