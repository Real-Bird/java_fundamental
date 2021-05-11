package java_20210511.step5;

public class StopWatchDemo {
	public static void run(StopWatch s) {
		s.execute();
	}

	public static void main(String[] args) {
		StopNanoWatch n = new StopNanoWatch();
		StopMiliWatch m = new StopMiliWatch();
		StopMicroWatch c = new StopMicroWatch();
		
		run(c);
	}
}
