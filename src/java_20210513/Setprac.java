package java_20210513;

import java.util.Iterator;
import java.util.TreeSet;

public class Setprac {
	private TreeSet lottoset;

	public Setprac() {
		lottoset = new TreeSet();
	}
	
	public TreeSet lottery() {
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
		return lottoset;
	}
	
	public void print() {
		for (int i = 0; i < 5; i++) {
			lottery();
		}
	}
}
