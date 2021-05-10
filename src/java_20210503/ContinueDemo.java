package java_20210503;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 6)	continue;
			sum += i;
			/*이렇게도 가능 / continue를 안 썼을 때
			  if(i != 6){
			  		sum += i;
			  }
			*/
			
		}
		System.out.println("합은 : " + sum);
	}
}
