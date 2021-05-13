package java_20210513;

import java.util.Iterator;

public class StringDemo {

	public static void main(String[] args) {
		char[] c = { 'h', 'e', 'l', 'l', 'o' };
		String str = new String(c);
		System.out.println(str);

		// charAt() : 특정 문자 하나 추출 메서드
		char c1 = str.charAt(1);
		System.out.println(c1);

		// concat() : 문자열 연결 메서드
		str = str.concat("123");
		System.out.println(str);

		str = new String("abc.zip");
		// endsWith() : 특정 문자열로 끝나면 true, 그렇지 않으면 false 반환
		if (str.endsWith("zip")) {
			System.out.println("압축파일입니다.");
		} else if (str.endsWith("doc")) {
			System.out.println("워드문서입니다.");
		} else {
			System.out.println("파일입니다.");
		}

		String url = new String("http://www.naver.com");
		String path = new String("/news/board.do?id=123&cat=1");
		// startsWith() : 특정 문자열로 시작하면 true, 그렇지 않으면 false 반환
		if (path.startsWith("/news")) {
			System.out.println("뉴스 페이지입니다.");
		} else if (path.startsWith("/sports")) {
			System.out.println("스포츠 페이지입니다.");
		} else {
			System.out.println("페이지가 존재하지 않습니다.");
		}

		// equals() : 문자열 내용 비교 //equalsIgnoreCase() : 대소문자 구분X 비교
		// trim() : 앞뒤 공백 제거
		String m1 = new String("hello ").trim();
		String m2 = new String("hello");
		if (m1.equals(m2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		String ma = new String("HELLO");
		String mb = new String("hello");
		if (ma.equalsIgnoreCase(mb)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// getBytes() : 문자열을 바이트 배열로 반환하는 메서드
		String m3 = new String("안녕하세요.");
		byte[] b = m3.getBytes();
		System.out.println(b.length);

		// indexOf() : 앞에서 찾은 특정 문자의 위치 추출
		String m4 = new String("111111-1111118");
		int index = m4.indexOf("-");
		System.out.println(index);

		// lastIndexOf() : 문자열 뒤에서 찾고, 앞부터 찾은 문자열까지 위치 추출
		String m5 = new String("a.b.c.doc");
		int lastIndexOf = m5.lastIndexOf(".");
		System.out.println(lastIndexOf);

		// 특정 위치(앞에서 찾음)를 기준으로 앞 문자열과 뒤 문자열을 뽑아내는 공식
		System.out.println(m4.substring(0, m4.indexOf("-")));
		System.out.println(m4.substring(m4.indexOf("-") + 1));

		// 특정 위치(뒤에서 찾음)를 기준으로 앞 문자열과 뒤 문자열을 뽑아내는 공식
		System.out.println(m5.substring(0, m5.lastIndexOf(".")));
		System.out.println(m5.substring(m5.lastIndexOf(".")));

		//구분자(delimiter)가 세 개인 전화번호 각 토큰(token) 추출
		String m6 = new String("010-1234-9999");
		System.out.println(m6.substring(0, m6.indexOf("-")));
		System.out.println(m6.substring(m6.indexOf("-") + 1, m6.lastIndexOf("-")));
		System.out.println(m6.substring(m6.lastIndexOf("-") + 1));
		
		int a1 = Integer.parseInt(m4.substring(0,1)); //문자열을 primitive로 변경
		//String m7 = 123 + ""; //없어 보이고, 사용하지 않으면 C.P에 쌓임
		String m8 = String.valueOf(123); //primitive를 문자열로 변경
		
		//replaceAll() : 앞 문자를 뒤 문자로 교체함
		String m9 = m6.replaceAll("-", "_");
		System.out.println(m9);
		
		String m10 = new String("hello");
		String m11 = m10.toUpperCase();
		System.out.println(m11);
		String m12 = m11.toLowerCase();
		System.out.println(m12);
		
		String[] temp = m6.split("-");
		for(String value:temp) {
			System.out.printf("%s\t", value);
		}
		System.out.println();
		
		
		double d = 123456.123;
		String m13 = String.format("%,.2f", d);
		System.out.format("%s%n", m13);
		
	}

}
