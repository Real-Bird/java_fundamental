package java_20210430;

public class CalendarDemo {

	public static void main(String[] args) {
		/*
		 * 달력 만들기
		 * 1. 1년 1월 1일은 월요일 
		 * 2. 1년은 365일이고, 윤년은 366일 - 2월 29일 
		 * 3. 윤년은 4년마다 발생하고 그중에서 100의 배수는 제외, 400의 배수는 제외하지 않음 
		 * 4. 2021년 4월 30일은 무슨 요일? 
		 * 힌트) 2020년까지 총 일수, 1-3월까지 총 일수, 30 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일, …0이면 일요일
		 */
		int year = 2021;
		//int month = 5;
		int month = 4;
		//int day = Integer.parseInt(args[0]);
		int day = 30;
		// 2020년까지 총 일수
		//int dsum = 2020 * 365;
		
		//2020년까지 총 일수 + 윤년 일수 - 100의 배수 + 400의 배수
		int dsum = 365 * (year - 1) + (year - 1)/4 - (year - 1) / 100 + (year - 1) / 400;
				
		// 윤년 일수, 400의 배수 포함, 100의 배수 제외 및 21년 1~4월 일수부터 오늘까지 일수 포함
		//dsum += (2020 / 4 - 2020 / 100 + 2020 / 400) + 31 + 28 + 31 + 30 + day; 이것은 5월을 구한 것
		
		//21년 1~3월 합 + 4월 일수
		dsum += 31 + 28 + 31 + day;
		
		
		int dayOfweek = dsum % 7;
		String message = "";
		// 나머지에 따른 요일
		/*if (dsum % 7 == 1) {
			System.out.printf("오늘은 %d년 %d월 %d일 월요일입니다.", year, month, day);
		} else if (dsum % 7 == 2) {
			System.out.printf("오늘은 %d년 %d월 %d일 화요일입니다.", year, month, day);
		} else if (dsum % 7 == 3) {
			System.out.printf("오늘은 %d년 %d월 %d일 수요일입니다.", year, month, day);
		} else if (dsum % 7 == 4) {
			System.out.printf("오늘은 %d년 %d월 %d일 목요일입니다.", year, month, day);
		} else if (dsum % 7 == 5) {
			System.out.printf("오늘은 %d년 %d월 %d일 금요일입니다.", year, month, day);
		} else if (dsum % 7 == 6) {
			System.out.printf("오늘은 %d년 %d월 %d일 토요일입니다.", year, month, day);
		} else {
			System.out.printf("오늘은 %d년 %d월 %d일 일요일입니다.", year, month, day);
		}
		*/
		
		if(dayOfweek==1) {
			message = "월요일";
		}else if(dayOfweek==2) {
			message = "화요일";
		}else if(dayOfweek==3) {
			message = "수요일";
		}else if(dayOfweek==4) {
			message = "목요일";
		}else if(dayOfweek==5) {
			message = "금요일";
		}else if(dayOfweek==6) {
			message = "토요일";
		}else if(dayOfweek==0) {
			message = "일요일";
		}
		System.out.printf("%d년 %d월 %d일은 %s 입니다", year, month, day, message);
	
	}

}
