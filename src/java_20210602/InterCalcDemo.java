package java_20210602;

public class InterCalcDemo {
	public static void main(String[] args) {
		DayCalc dc = new DayCalc();
		
		int dayDiff = dc.dayDiff("2020-05-17", "2021-01-27");
		int dayInter = dc.dayInter(5000000, 0.18);
		
		System.out.printf("투자 기간은 총 %d일이며, 이자는 총 %,d원입니다.", dayDiff, dayInter * dayDiff);
	}
}
