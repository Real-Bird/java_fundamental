package java_20210601;

public class InterestCalcDemo {
	int principal;
	double interestRate;
	int month;
	static double tax = 0.154;
	
	public InterestCalcDemo() {

	}

	public void interMonth(int principal, double interestRate, int totalMonth) {
		double beforeTax = principal * interestRate / 12 * totalMonth;
		double interTax = principal * interestRate / 12 * totalMonth * tax;
		double interest = beforeTax - interTax;
		System.out.printf("원금 %,d원에 대한 %d개월 세전 이자는 %,.0f원입니다.%n", principal, totalMonth, beforeTax);
		System.out.printf("원금 %,d원에 대한 %d개월 세후 이자는 %,.0f원입니다.%n%n", principal, totalMonth, interest);
	}

	public void interOneMonth(int principal, double interestRate, int totalMonth) {
		double beforeTax = principal * interestRate / 12 * totalMonth / totalMonth;
		double interTax = principal * interestRate / 12 * totalMonth / totalMonth * tax;
		double interest = beforeTax - interTax;
		System.out.printf("원금 %,d원에 대한 한 달 세전 이자는 %,.0f원입니다.%n", principal, beforeTax);
		System.out.printf("원금 %,d원에 대한 한 달 세후 이자는 %,.0f원입니다.%n%n", principal, interest);
	}
	
	public static void main(String[] args) {
		InterestCalcDemo inter = new InterestCalcDemo();
		
		inter.interMonth(5000000, 0.18, 6);
		inter.interMonth(1000000, 0.18, 6);
		
		inter.interOneMonth(5000000, 0.18, 6);
		inter.interOneMonth(1000000, 0.18, 6);
	}
}
