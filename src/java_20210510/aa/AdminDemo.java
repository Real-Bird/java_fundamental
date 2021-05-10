package java_20210510.aa;
import java_20210510.Admin; //class의 접근 한정자가 default면 import, new 모두 사용 불가
public class AdminDemo {

	public static void main(String[] args) {
		Admin/*클래스의 접근 한정자 결정*/ a = new Admin()/*생성자 접근 한정자 결정*/;
		
	}

}
