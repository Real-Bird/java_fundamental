package java_20210506;

public class LottoAscenticDemo2 {
	public static void main(String[] args) {
		int[] lotto = new int[6];

		for (int h = 0; h < 5; h++) {
			for (int i = 0; i < lotto.length; i++) {
				int random = (int) (Math.random() * 45) + 1;
				lotto[i] = random;
				for (int j = 0; j < i; j++) {
					if (random == lotto[j]) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < lotto.length; i++) {
				for (int j = 0; j < lotto.length - (i +1); j++) {
					//if (lotto[j] < lotto[j + 1]) { //내림차순
					if (lotto[j] > lotto[j + 1]) { //오름차순
						int temp = lotto[j];
						lotto[j] = lotto[j+1];
						lotto[j+1] = temp;
					}
				}
			}
			for (int i = 0; i < lotto.length; i++) {
				System.out.printf(lotto[i] + "\t");
			}
			System.out.println();
		}

	}
}
