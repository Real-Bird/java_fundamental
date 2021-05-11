package java_20210511.Shape;

public class ShapeDemo {

	public static void main(String[] args) {
		ShapeManager manager = ShapeManager.getInstance();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();

		manager.run(r);
	}

}
