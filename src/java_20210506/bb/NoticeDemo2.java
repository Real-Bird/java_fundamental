package java_20210506.bb;
import java_20210506.aa.Notice;
public class NoticeDemo2 extends Notice{

	public static void main(String[] args) {
		//서로 자른 패키지의 클래스를 사용하기 위해서는 import 구분을 사용해야 함\
		//Package > import > class순으로 코딩 
		Notice n1 = new Notice();
		n1.nunmber = 1; //public 서로 다른 패키지에도 접근 가능
		//n.title=""; //protected 서로 다른 패키지에서 접근하려면 상속받은 경우만 가능함
		//n.hit = 10; //default 서로 다른 패키지에서 접근 불가능
		//n1.regdate = ""; private 서로 다른 패키지에서 접근 불가능

		NoticeDemo2 n2 = new NoticeDemo2();
		n2.nunmber = 2;
		n2.title = ""; //상속을 받으면 protected까지 접근 가능
		//n2.hit=10;
		//n2.regdate = "";
	}

}
