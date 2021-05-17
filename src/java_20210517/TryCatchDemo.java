package java_20210517;

public class TryCatchDemo {
	public static double getAvgs(int k, int e) {
		int sum = k + e;
		double avg = (double) sum / 2;
		return avg;
	}

	// javac TryCatchDemo.java => compile
	// java TryCatchDemo 10 20 30 <= 실행 시 인자
	// Run Configurations => Arguments => Program Arguments
	// -> 10 20 => 정상
	// -> 10 a => NumberFormatException
	// -> 10 => ArrayIndexOutOfBoundsException
	// ->
	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]/*실행 시 인자*/);
			int english = Integer.parseInt(args[1]/*실행 시 인자*/);
		
			double average = getAvgs(korean, english);
		
			System.out.printf("국어와 영어의 평균 점수는 %.1f 입니다.", average);
		}catch(NumberFormatException e) {
			//catch 블록의 수행문을 만들 때 2가지 형태로 코딩함
			//1. 에러 메세지 출력(개발자) - 개발 단계
			//2. 에러 메세지 출력(사용자) - 서비스 단계
			//e.printStackTrace();
			//System.err.println(e.getMessage());
			System.err.println("숫자만 입력해!");
		}catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace(); //추적한 에러 스택 출력
			//System.err.println(e.getMessage()); //에러 메세지만 출력
			System.err.println("인자 2개가 필요해!"); //사용자에게 보여줄 에러 메세지
		}finally {
			System.out.println("무조건 수행되는 블록 - finally");
		}
	}
}
