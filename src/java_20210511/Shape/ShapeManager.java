package java_20210511.Shape;

public class ShapeManager {

	private static ShapeManager single;

	private ShapeManager() {
	}
	//            클래스 타입 반환형
	public static ShapeManager getInstance() {
		if (single == null) {
			single = new ShapeManager();//인스턴스 생성
		}
		return single;//생성된 인스턴스 리턴
	}

	public void run(Shape s) {
		s.draw();
	}
}
