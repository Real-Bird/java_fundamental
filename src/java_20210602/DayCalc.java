package java_20210602;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayCalc {
	Calendar sDate;
	Calendar eDate;
	int principal;
	double interRate;
	static double tax = 0.154;
	
	
	public DayCalc() {
		sDate = Calendar.getInstance();
		eDate = Calendar.getInstance();
	}
	
	public long dayDiff(String startDate, String endDate) {
		try {
			Date s_date = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
			sDate.setTime(s_date);
			Date e_date = new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
			eDate.setTime(e_date);
			
			long diffDays = ((eDate.getTimeInMillis() - sDate.getTimeInMillis()))/1000 / 24 * 60 * 60;
			return diffDays;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public void dayInter(int principal, double interRate) {
		double beforeTax = principal * interRate/365;
		double fxxkingTax = beforeTax * tax;
		double dailyInter = beforeTax - fxxkingTax;
		System.out.printf("원금 %,d원의 일일 이자는 %,.0f원입니다.", principal, dailyInter);
	}
	
	
	
	/*
	Calendar getToday = Calendar.getInstance();
	getToday.setTime(new Date()); // 금일 날짜

	String s_date = "2020-03-01";
	Date date = new SimpleDateFormat("yyyy-MM-dd").parse(s_date);
	Calendar cmpDate = Calendar.getInstance();
	cmpDate.setTime(date); // 특정 일자

	long diffSec = (getToday.getTimeInMillis() - cmpDate.getTimeInMillis()) / 1000;
	long diffDays = diffSec / (24 * 60 * 60); // 일자수 차이

	System.out.println(diffSec + "초 차이");
	System.out.println(diffDays + "일 차이");
	*/
}
