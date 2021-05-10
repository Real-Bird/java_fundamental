package java_20210507;

public class AscDescDemo {
	public static void main(String[] args) {
		int[] a = { 12, 43, 55, 11, 3, 6, 1 };
		//오름차순
		Ascending asc = new Ascending();
		asc.ascending(a);
		

		//내림차순
		Descending desc = new Descending();
		desc.descending(a);

	}
}
