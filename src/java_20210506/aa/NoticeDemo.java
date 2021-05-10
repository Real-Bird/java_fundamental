package java_20210506.aa;

public class NoticeDemo {
	public static void main(String[] args) {
		Notice n = new Notice();
		
		n.nunmber = 1; //public 서로 다른 패키지에서 접근가능
		n.title = "공지사항"; //protected 서로 다른 패키지이면서 상속받은 경우만 접근가능
		n.hit = 0; //default 같은 패키지 내애서 접근가능
		//n.regdate = "2021-05-06"; //private 같은 클래스 내에서 접근 불가능
		

	}

}
