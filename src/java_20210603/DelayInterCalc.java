package java_20210603;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DelayInterCalc {
	Calendar sDate;
	Calendar eDate;
	int principal;
	double interRate;
	static double tax = 0.154;
	Scanner scan = new Scanner(System.in);
	public DelayInterCalc() {
		sDate = Calendar.getInstance();
		eDate = Calendar.getInstance();
	}

	public int dayDiff(String startDate, String endDate) {
		try {
			Date s_date = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
			sDate.setTime(s_date);
			Date e_date = new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
			eDate.setTime(e_date);

			int diffDays = (int) (((eDate.getTimeInMillis() - sDate.getTimeInMillis())) / 1000 / (24 * 60 * 60));
			return diffDays;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	public int dayInter(int principal, double interRate) {
		double beforeTax = principal * interRate / 365;
		double fxxkingTax = beforeTax * tax;
		int dailyInter = (int) (beforeTax - fxxkingTax);
		return dailyInter;
	}

}
