package java_20210511;

public class SubDemo {

	public static void main(String[] args) {
		
		Sub sub = new Sub();
		System.out.println(sub.money);
		sub.makeMoney();
		System.out.println(sub.chicken);
		sub.gotoSchool();
		sub.play("~~~");
		
		Super sup = new Super();
		System.out.println(sup.money);
		sup.makeMoney();
		sup.play("~~");
		
		Super sup1 = new Sub();
		System.out.println(sup1.money);
		sup1.makeMoney();
		sup1.play("~"); // overriding되어 Sub클래스 play() 호출
		
		System.out.println(sub);
		System.out.println(sub.toString()); // Object클래스의 toString()메서드
		
		Object obj = new Sub();
		System.out.println(obj.toString()); // Sub클래스와 overriding 상태
		
	}

}
