package java_20210512;

public class StringDemo {
	public static String reverse(String str) {
		String temp = new String();
		for (int i = str.length()-1; i > -1; i--) {
			temp += str.substring(i, i+1);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = "test";
		String str4 = "test";

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		String str = "beautiful";
		System.out.println(str.substring(0, 1));
		String str5 = reverse(str);
		System.out.println(str5);
	}
}
