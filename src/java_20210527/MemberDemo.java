package java_20210527;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		/*
		int num = 12;
		String name = "김범수";
		String addr = "갓카오";
		MemberDto dto = new MemberDto(num, name, addr);
		*/
		/*
		boolean success = dao.insert(dto);
		if(success) {
			System.out.println("insert 성공");
		} else {
			System.err.println("insert 실패");
		}
		*/
		
		/*
		boolean success = dao.update(dto);
		if(success) {
			System.out.println("update 성공");
		}else {
			System.err.println("update 실패");
		}
		*/
		
		/*
		boolean success = dao.delete(num);
		if(success) {
			System.out.println("delete 성공");
		} else {
			System.out.println("delete 실패");
		}
		*/
		
		int start = 0;
		int len = 10;
		ArrayList<MemberDto> list = dao.select(start, len);
		for(MemberDto dto : list) {
			int num = dto.getNum();
			String name = dto.getName();
			String addr = dto.getAddr();
			System.out.printf("%d \t %s \t %s%n", num, name, addr);
		}
		
		
	}
}
