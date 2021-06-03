package java_20210602;

import java_20210603.DelayInterCalc;

public class InterCalcDemo {
	public static void main(String[] args) {
		DayCalc dc = new DayCalc();
		DelayInterCalc dic = new DelayInterCalc();
		
		int dayDiff = dc.dayDiff("2020-05-17", "2021-01-27");
		int dayInter = dc.dayInter(5000000, 0.18);
		int delayDiff = dic.dayDiff("21-01-28",	"21-06-03");
		int delayInter = dic.dayInter(5000000, 0.2);
		
		System.out.printf("투자 기간은 총 %d일이며, 이자는 총 %,d원입니다.%n", dayDiff, dayInter * dayDiff);
		System.out.printf("연체 기간은 총 %d일이며, 연체이자는 총 %,d원입니다.%n", delayDiff, delayInter * delayDiff);
		System.out.printf("정상 기간과 연체 기간의 총 투자일은 %d일이며,%n총 합산 이자는 %,d원입니다.%n", dayDiff+delayDiff, dayInter*dayDiff + delayInter*delayDiff);
	}
}
