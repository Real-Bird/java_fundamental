package java_20210513;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// HashSet 클래스는 데이터(객체)의 주복을 허용하지 않고, 순서 없음.
		// HashSet set = new HashSet();

		// TreeSet 클래스는 데이터(객체)의 중복을 허용하지 않고, natural ordering(숫자일 때와 문자일 때 정렬방식이 다름)을 함
		TreeSet set = new TreeSet();

		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("1");
		set.add("11");
		set.add("12");
		set.add("13");
		set.add("45");
		set.add("93");
		set.add("23");

		// HashSet 클래스는 자체적으로 출려할 방법이 없음
		// HashSet 클래스를 Iterator로 변환해서 출력해야 함
		Iterator i = set.iterator();
		// hasNext() : Iterator에 출력할 객체가 존재하는지 판단하는 메서드
		// 존재하면 true, 부재하면 false
		while (i.hasNext()) {
			// 해당 객체를 가져옴
			// Integer temp = (Integer) i.next();
			String temp = (String) i.next();
			System.out.println(temp);
		}

		TreeSet lottoset = new TreeSet();
		while (true) {
			int random = (int) (Math.random() * 45) + 1;
			lottoset.add(random);
			if (lottoset.size() == 6)
				break;
		}

		Iterator i2 = lottoset.iterator();
		while (i2.hasNext()) {
			Integer temp = (Integer) i2.next();
			System.out.print(temp + "\t");
		}

	}
}
