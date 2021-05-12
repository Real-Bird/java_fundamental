package java_20210512;

public class MathDemo {
	public static void main(String[] args) {
		double d = Math.ceil(5.7);
		System.out.println(d);
		
		d = Math.floor(5.7);
		System.out.println(d);
		
		int i = Math.round(3.2f);
		System.out.println(i);
		
		long l = Math.round(5.2);
		System.out.println(l);
		
		d = Math.abs(-4.5);
		System.out.println(d);
		
		d = Math.max(d, i);
		System.out.println(d);
		
		d = Math.min(d, i);
		System.out.println(d);
		
		d = Math.sqrt(3);
		System.out.println(d);
		
		l = (long) Math.pow(10, 10);
		System.out.println(l);
		
		d = Math.random();
		System.out.println(d);
	}
}
