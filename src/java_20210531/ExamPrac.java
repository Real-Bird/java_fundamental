package java_20210531;

import java.util.ArrayList;

public class ExamPrac extends Exam {
	int num;
	String name;

	public ExamPrac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExamPrac(String name) {
		this(0, name);
	}

	public ExamPrac(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExamPrac other = (ExamPrac) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "name";
	}

	public void run(int a, int b) {
		System.out.println("하위 클래스 오버라이딩");
	}

	public static void main(String[] args) {

		ExamPrac ex1 = new ExamPrac("abc");
		ExamPrac ex2 = new ExamPrac("abc");

		System.out.println(ex1.equals(ex2)); // overriding 안 하면 false , overriding 하면 true
		System.out.println(ex1.toString()); // overriding 안 하면 java_20210531.ExamPrac@2d979f , overriding 하면 return값

		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		int sum1 = 0;
		int i = 0;
		while (i < 100) {
			sum1 += i;
			i++;
		}
		System.out.println(sum1);

		String s1 = "123.4855";
		double s2 = Double.parseDouble(s1);
		System.out.println(s2);

		StringBuffer sb = null;
		System.out.println(sb = new StringBuffer("abc"));

		System.out.println(sb.append("123"));

		System.out.println(sb.insert(2, "xyz"));

		System.out.println(sb.delete(3, 5));

		System.out.println(sb.reverse());

		sb.setLength(0);

		System.out.println(sb.length());

		System.out.println(sb.append("hello"));
		System.out.println(sb.toString());

		ExamPrac exam = new ExamPrac();
		exam.run(1, 2);

		Exam ex = new Exam();
		ex.run(2, 2);

		ArrayList<String> list = new ArrayList<String>();

		list.add("111");
		list.add("222");
		list.add("333");
		list.add("111");
		
		for(String value : list) {
			System.out.println(value);
		}

	}

}
