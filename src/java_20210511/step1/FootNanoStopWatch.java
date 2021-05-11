package java_20210511.step1;

public class FootNanoStopWatch {
	long startTime;
	long endtime;
	public double getElapsedTime() {
		return (double)(endtime - startTime) / 1000000000;
	}
	public static void main(String[] args) {
		FootNanoStopWatch f = new FootNanoStopWatch();
		//1970년 1월 1일부터 현재까지의 시간을 나노세컨드로 반환
		f.startTime = System.nanoTime();
		
		for(long i = 0; i<3_000_000_000l ; i++) {
			
		}
	f.endtime = System.nanoTime();
		double elapsedTime = f.getElapsedTime();
		System.out.printf("경과 시간 : %,.9f", elapsedTime);
	}
}
