package java_20210429;

// 폰트 바꾸는 방법 - Window > preferences > font검색 > colors and font > java editor text font 변경
// 안녕, 세계여!
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello /*주석 아님*/ World");
		System.out.println("Hello World/*주석 아님*/");
		System.out.println("Hello World"/*주석임*/);
		System.out.println("Hello World");/*주석임*/
		System.out.println("Hello World");//주석임
		System.out.printf("%n Hello World");
	}
}