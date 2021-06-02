package java_20210602;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class InterCalcDemo {
	public static void main(String[] args) {
		DayCalc dc = new DayCalc();
		
		System.out.println(dc.dayDiff("2020-05-17", "2021-01-27") + "일");
		dc.dayInter(5000000, 0.18);
	}
}
