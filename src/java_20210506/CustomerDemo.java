package java_20210506;

public class CustomerDemo {
	public static void main(String[] args) {
		//class(=static) 변수는 클래스 이름으로 접근하는 것이 관례
		//변수로도 접근 가능하나 권장 X ex) c1.interestRate = 6.2;
		Customer.interestRate = 6.2;
		//final 변수는 값을 재할당할 수 없음
		//Customer.BANKNAME = "국민은행";
		
		Customer c1 = new Customer();
		c1.name = "김진영";
		c1.age = 30;
		c1.email = "dreams@cometrue.com";
		c1.phone = "010-0000-0000";
		c1.balance = 3_000_000_000l;
		c1.released = false;
		
		System.out.printf("%s, %d, %s, %s, %,d, %s %n", c1.name, c1.age, c1.email, c1.phone, c1.balance, c1.released);
		
		Customer c2 = new Customer();
		c2.name = "워런 버핏";
		c2.age = 80;
		c2.email = "buffit@berkshier.com";
		c2.phone = "010-9999-9999";
		c2.balance = 10_000_000_000_000l;
		c2.released = false;
		
		System.out.printf("%s, %d, %s, %s, %,d, %s %n", c2.name, c2.age, c2.email, c2.phone, c2.balance, c2.released);
		
		Customer c3 = c2;
		c3.name = "하워드 막스";
		
		System.out.printf("%s, %s %n", c2.name, c3.name);
		System.out.printf("%.1f, %s", Customer.interestRate, Customer.BANKNAME);
		
	}

}
