package java_20210507;

public class Calendar {

	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	public static final int SUNDAY = 0;
	
	private boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	private int getCount(int year, int month, int day) {
		int totalCount = 365 * (year - 1);
		change(year);
		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}

		totalCount += day;

		return totalCount;
	}

	private void change(int year) {
		boolean isLeapYear = isLeapYear(year);
		if (isLeapYear) {
			monthArray[1] = 29;
		}
	}

	public void print(int year, int month, int day) {

		int totalCount = getCount(year, month, day);

		int dayOfweek = totalCount % 7;
		String message = "";

		if (dayOfweek == Calendar.MONDAY) {
			message = "월요일";
		} else if (dayOfweek == Calendar.TUESDAY) {
			message = "화요일";
		} else if (dayOfweek == Calendar.WEDNESDAY) {
			message = "수요일";
		} else if (dayOfweek == Calendar.THURSDAY) {
			message = "목요일";
		} else if (dayOfweek == Calendar.FRIDAY) {
			message = "금요일";
		} else if (dayOfweek == Calendar.SATURDAY) {
			message = "토요일";
		} else if (dayOfweek == Calendar.SUNDAY) {
			message = "일요일";
		}
		System.out.printf("%d년 %d월 %d일은 %s 입니다", year, month, day, message);
		System.out.println();
		System.out.println();

	}

	public void print(int year, int month) {
		System.out.println(year + "년 " + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		// 구하고자 하는 날짜의 달 1일까지의 총 일자 % 7 == 숫자만큼 \t
		int totalCount = getCount(year, month, 1);
		int rest = totalCount % 7;
		//int count == 0;
		for (int i = 0; i < rest; i++) {
			System.out.print("\t");
			//count++;
		}
		
		for (int i = 1; i <= monthArray[month - 1]; i++) {
			System.out.print(i + "\t");
			//count++;
			//if (count % 7 == 0) System.out.println(); //rest가 아닌 count변수로 7이 될 때마다 개행
			if (rest % 7 == 6) System.out.println();
			rest++;
		}
		System.out.println();
		System.out.println();
	}

	public void print(int year) {
		
		for (int i = 1; i <= 12; i++) {
			print(year, i);
			System.out.println();
		}
		
	}
}