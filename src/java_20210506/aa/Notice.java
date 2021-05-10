package java_20210506.aa;

public class Notice {
	public int nunmber;
	protected String title;
	int hit;
    String regdate;
	
	public static void main(String[] args) {
		Notice n = new Notice();
		n.regdate = "2021-05-06"; //private 같은 클래스 내에서 접근 불가능
	}
}
