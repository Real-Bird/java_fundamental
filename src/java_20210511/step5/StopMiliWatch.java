package java_20210511.step5;

public class StopMiliWatch extends StopWatch {

	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		endTime = System.currentTimeMillis();
	}

	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1000;
	}

	public void execute() {
		start();
		for (long i = 0; i < 30_000_000_000l; i++) {

		}
		stop();
		double elapsedTime = getElapsedTime();
		System.out.printf("경과 시간 : %,.3f", elapsedTime);
	}
}
