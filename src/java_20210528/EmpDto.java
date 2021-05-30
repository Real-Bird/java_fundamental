package java_20210528;

public class EmpDto {
	private int no;
	private String name;
	private String job;
	private int mgr;
	private String hiredate; // insert '2021-05-28' select date_format()
	private double sal;
	private double comm;
	private int deptno;
	public EmpDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpDto(int no, String name, String job, int mgr, String hiredate, double sal, double comm, int deptno) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	
	
	public EmpDto(String name, String job, String hiredate, double sal, int deptno) {
		super();
		this.name = name;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptno = deptno;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
}
