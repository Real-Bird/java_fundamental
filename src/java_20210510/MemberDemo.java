package java_20210510;

public class MemberDemo {
	public static void print(Member m) {
		System.out.println(m.getName());
		System.out.println(m.getEmail());
		System.out.println(m.getAddr1());
		System.out.println(m.getAddr2());
		System.out.println(m.getZipcode());
		System.out.println(m.getAge());
		
	}
	public static void main(String[] args) {
		Member m = new Member();
		m.setName("홍길동");
		m.setEmail("abc@abc.abc");
		m.setAddr1("여기시 저기구 거기동");
		m.setAddr2("요기시 조기구 고기동");
		m.setZipcode("09876");
		m.setAge(20);

		print(m);
	}
}
