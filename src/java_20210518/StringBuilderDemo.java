package java_20210518;

public class StringBuilderDemo {
	public static void main(String[] args) {
		//StringBuffer와 똑같은 기능이나 웹에서는 String Builder 속도가 더 빠름
		//StringBuffer는 멀티 스레드에서 안정성이 높은 대신 속도가 느림
		StringBuilder s1 = new StringBuilder("hello");
		StringBuilder s2 = new StringBuilder("hello");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(s1/* .toString() 생략 */);

		// StringBuilder()를 String으로 변경
		String str1 = s1.toString();
		String str2 = s2.toString();

		System.out.println(str1.equals(str2));

		StringBuilder sql = new StringBuilder();
		sql.append("select name, age ");
		sql.append("from member ");
		sql.append("where name = '이말똥' ");

		System.out.println(sql);
		// sql의 모든 문자열 지우기
		sql.setLength(0);

		sql.append("select no, writer from board");
		System.out.println(sql);

	}

}