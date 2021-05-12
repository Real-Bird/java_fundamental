package java_20210512;

public class StringDemo {
	public static String reverse(String str) {
		String[] s = new String[str.length()];
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j <= str.length(); j++) {
				s[i] += str.substring(i, j);
				count++;
			}
		}
		String k = null;
		for (int i = 0; i < str.length(); i++) {
			if(count==1) {
				k = s[i];
				s[i] = s[i+1];
				s[i+1] = k;
			}
		}
		return "";
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
