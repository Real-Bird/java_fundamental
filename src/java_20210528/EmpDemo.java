package java_20210528;

public class EmpDemo {
	public static void main(String[] args) {
		EmpDao dao = EmpDao.getInstance();
		
		/*
		// empno, ename, job, mgr, hiredate, sal, comm, deptno
		boolean success = dao.insert(new EmpDto(8000, "Lee", "Student", 7839, "2021-05-27", 500, 10, 60));
		if(success) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
		*/
		
		/*
		boolean success = dao.update(new EmpDto(8000, "LEE", "STUDENT", 7839, "2021-05-27", 500, 10, 60));
		if(success) {
			System.out.println("update 성공");
		} else {
			System.out.println("update 실패");
		}
		*/
		
		/*
		boolean success = dao.delete(8000);
		if(success) {
			System.out.println("delete 성공");
		} else {
			System.out.println("delete 실패");
		}
		*/
		
		int start = 0;
		int len = 10;
		for(EmpDto dto : dao.select(start, len)) {
			String name = dto.getName();
			String job = dto.getJob();
			String hiredate = dto.getHiredate();
			double sal = dto.getSal();
			int deptno = dto.getDeptno();
			System.out.printf("%s \t %s \t %s \t %.0f \t %d%n", name, job, hiredate, sal, deptno);
		}
	}	
}
