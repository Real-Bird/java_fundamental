package java_20210604;

import java.util.ArrayList;

public class DogeDemo {
	private String name;
	private String age;
	private int jump;
	private int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getJump() {
		return jump;
	}

	public void setJump(int jump) {
		this.jump = jump;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public DogeDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DogeDemo(String name, String age, int jump, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.jump = jump;
		this.weight = weight;
	}

	public static void main(String[] args) {
		// 입력
		ArrayList<String> list = new ArrayList<String>();
		int[] stoneDurability = { 5, 3, 4, 1, 3, 8, 3 };
		DogeDemo[] doge = { new DogeDemo("루비독", "95년생", 3, 4), new DogeDemo("피치독", "95년생", 3, 3),
				new DogeDemo("씨-독", "72년생", 2, 1), new DogeDemo("코볼독", "59년생", 1, 1) };

		for (DogeDemo dog : doge) {
			int dogePose = 0;
			boolean flag = true;
			
			while (dogePose < stoneDurability.length) {
				
				dogePose += dog.getJump();
				
				if (dogePose > stoneDurability.length) {
					break;
				}
				
				stoneDurability[dogePose - 1] -= dog.getWeight();
				
				if (stoneDurability[dogePose - 1] < 0) {
					flag = false;
					break;
				}
				
			}
				if (flag) {
					list.add(dog.getName());
				}
			}
			System.out.println("생존자 : " + list.toString());
	}
}
