package java_20210511.Shape1;

public class PastShape {

	String circle;
	String rectangle;
	String triangle;

	public void drawC() {
		System.out.println("Circle의 draw()");
	}

	public void drawR() {
		System.out.println("Rectangle의 draw()");
	}

	public void drawT() {
		System.out.println("Triangle의 draw()");
	}

	public static void main(String[] args) {
		PastShape ps = new PastShape();

		ps.drawC();
		ps.drawR();
		ps.drawT();

	}
}
