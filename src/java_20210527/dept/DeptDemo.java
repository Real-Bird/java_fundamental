package java_20210527.dept;

import java.util.ArrayList;

public class DeptDemo {
	public static void main(String[] args) {
		DeptDao dao = DeptDao.getInstance();
		/*
		boolean success = dao.insert(new DeptDto(60,"LIGAL", "Taxas"));
		if(success) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
		*/
		
		/*
		boolean success = dao.update(new DeptDto(60,"LEGALTEAM", "TEXAS"));
		if(success) {
			System.out.println("update 성공");
		} else {
			System.out.println("update 실패");
		}
		*/
		
		/*
		boolean success = dao.delete(50);
		if(success) {
			System.out.println("delete 성공");
		} else {
			System.out.println("delete 실패");
		}
		*/
		
		int start = 0;
		int len = 10;
		ArrayList<DeptDto> list = dao.select(start, len);
		for(DeptDto dto : list) {
			int no = dto.getNo();
			String name = dto.getName();
			String loc = dto.getLoc();
			System.out.printf("%d \t %s \t %s%n", no, name, loc);
		}
		
		
	}
}
