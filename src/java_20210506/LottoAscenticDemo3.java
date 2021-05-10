package java_20210506;

import java_20210507.Ascending;

public class LottoAscenticDemo3 {
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
				for (int j = i + 1; j < lotto.length; j++) {
					if (lotto[i] > lotto[j]) {
						int k = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = k;
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