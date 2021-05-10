package java_20210504;

public class LottoDemo {

	public static void main(String[] args) {
		//math.ranom() => 0보다 크거나 같고 1보다 작은 임의 double 반환
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			//1보다 크고 46보다 작은 임의 int 반환
			int random = (int) (Math.random() * 45) + 1;
			boolean isExisted = false;
			//lotto[i] = random;
			for (int j = 0; j < i; j++) {
				//if(lotto[i]==lotto[j]) {
				if(random==lotto[j]) {
					isExisted = true;
					break;
					//i--; break;
				}
			}
			if(isExisted) {
				i--;
			}else {
				lotto[i] = random;
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
		
	}

}
