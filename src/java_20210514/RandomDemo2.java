package java_20210514;

import java.util.Arrays;

public class RandomDemo2 {
	public static int getRand(int from, int to) {
		return (int) (Math.random() * (Math.abs(to-from)+1)) + Math.min(from, to);
	}
	
	public static int[] fillRand(int[] arr, int[] data) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = data[getRand(0, data.length -1)];
		}
		return arr;
	}
	
	public static int[] fillRand(int[] arr, int from, int to) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getRand(from, to);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(getRand(5,10)+",");
		}
		
		int[] result = fillRand(new int[10], new int[] {2, 3, 7, 5});
		
		System.out.println(Arrays.toString(result));
	}
}
