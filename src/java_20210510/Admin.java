package java_20210510;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	
	//디폴트 생성자(arguments 없음)
	//생성자 > [접근한정자 [클래스 이름](){}
	//생성자는 반환값이 없음
	//생성자 역할은 인스턴스 변수 초기화
	//생성자는 overloading이 가능함
	//생성자의 접근 한정자는 인스턴스(new) 유무를 결정한다.
	public Admin() {
		//super();
	
	}
	
	public Admin(String id, String pwd, String email) {
		//super();
		//this(arguments); => arguments를 가진 다른 생성자를 호출. 생성자에서만 사용
		this(id,pwd,email,0);
	}
	public Admin(String id, String pwd, String email, int level) {
		//super();
		//this or this. => 자기 자신을 호출. 메서드, 생성자 모두 사용
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getEmail() {
		return email;
	}
	public int getLevel() {
		return level;
	}
}
