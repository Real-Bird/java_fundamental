package java_20210514;

import java.util.ArrayList;

public class MemberDemo {

	public static void main(String[] args) {
		MemberManager m = new MemberManager();
		
		m.insert("kim","김개똥", 10);
		m.insert("lee","이말똥", 20);
		m.insert("bark","박소똥", 30);
		m.insert("sin","신닭똥", 40);
		
		ArrayList list = m.select();
		
		// insert 검토
		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member) list.get(i);
			System.out.printf("%s, %s, %d %n", m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("========================");

		m.delete("kim");
		// delete 검토
		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member) list.get(i);
			System.out.printf("%s, %s, %d %n", m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("========================");
		
		m.update("bark", "박소똥", 100);
		// update 검토
		for (int i = 0; i < list.size(); i++) {
			Member m2 = (Member) list.get(i);
			System.out.printf("%s, %s, %d %n", m2.getId(), m2.getName(), m2.getAge());
		}
		System.out.println("========================");
		
		//특정 id 검토
		Member m3 = m.select("lee");
		System.out.printf("%s, %s, %d %n", m3.getId(), m3.getName(), m3.getAge());
		
	}

}
