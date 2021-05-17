package java_20210517;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo1 {
	public static void m()
			throws FileNotFoundException{
		
			FileReader fr = new FileReader("");			
		
	}
	public static void m(String path)
			throws FileNotFoundException{
		
		FileReader fr = new FileReader(path);			
		
	}
	
	public static void main(String[] args) {
		//m(); 
		String path = args[0];
		try{
			m(path);
			System.out.println("파일을 정상적으로 불러왔습니다.");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
			System.err.println("경로과 파일명을 정확히 입력하세요.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("실행시 파일명을 입력하세요.");
			System.err.println("Ex) Run Configurations -> Arguments -> Program Arguments");
		}finally {
			
		}
	}
}
