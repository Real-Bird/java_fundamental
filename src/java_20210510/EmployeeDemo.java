package java_20210510;

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "홍길동";//Employee 부모 클래스인 Customer의 모든 멤버 변수(name, phone1, phone2, phone3) 사용 가능
		e1.phone1 = "010";
		e1.phone2 = "1234";
		e1.phone3 = "5678";
		e1.zipcode = "98764";
		e1.addr1 = "서울";
		e1.addr2 = "종로구";
		e1.id = "abc";
		e1.pwd = "123";
		
	}

}
