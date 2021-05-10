package java_20210510;

public class AdminDemo {

	public static void main(String[] args) {
		Admin a = new Admin("abc", "123", "abd@abc.abc", 20);
		
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());
		//setter는 매개 변수 중 특정 개수만 바꿀 때 사용
	}
}
