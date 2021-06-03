package java_20210603;

import java.util.Scanner;

import java_20210602.DayCalc;

public class InterCalcDemo_v2 {
	public static void main(String[] args) {
		DayCalc dc = new DayCalc();
		DelayInterCalc dic = new DelayInterCalc();
		Scanner scan = new Scanner(System.in);

			System.out.print("시작 날짜를 입력해주세요.> ");
			String input1 = scan.nextLine();
			System.out.print("종료 날짜를 입력해주세요.> ");
			String input2 = scan.nextLine();
			System.out.print("원금을 입력해주세요.> ");
			String input3 = scan.nextLine();
			int principal = Integer.parseInt(input3);
			System.out.print("이율을 입력해주세요.> ");
			String input4 = scan.nextLine();
			double interRate = Double.parseDouble(input4);
			System.out.print("연체 날짜를 입력해주세요.> ");
			String input5 = scan.nextLine();
			System.out.print("연체이율을 입력해주세요.> ");
			String input6 = scan.nextLine();
			double delayRate = Double.parseDouble(input6);

			int dayDiff = dc.dayDiff(input1, input2);
			int dayInter = dc.dayInter(principal, interRate);
			System.out.printf("투자 기간은 총 %d일이며, 이자는 총 %,d원입니다.%n", dayDiff, dayInter * dayDiff);
			int delayDiff = dic.dayDiff(input2, input5);
			int delayInter = dic.dayInter(principal, delayRate);
			System.out.printf("연체 기간은 총 %d일이며, 연체이자는 총 %,d원입니다.%n", delayDiff, delayInter * delayDiff);

			System.out.printf("정상 기간과 연체 기간의 총 투자일은 %d일이며,%n총 합산 이자는 %,d원입니다.%n", dayDiff + delayDiff,
					dayInter * dayDiff + delayInter * delayDiff);

	}

}
