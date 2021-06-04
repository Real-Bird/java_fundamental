package java_20210604;

public class DecodingDemo {
	public static void main(String[] args) {
		String[] text = { "   + -- + - + -   ", "   + --- + - +   ", "   + -- + - + -   ", "   + - + - + - +   " };

		solution(text);
	}

	public static void solution(String[] text) {
		for (String string : text) {
			int i = Integer.parseInt(string.replace(" ", "").replace("+", "1").replace("-", "0"), 2);
			string = String.valueOf((char) i);
			System.out.print(string);
		}

	}

}
