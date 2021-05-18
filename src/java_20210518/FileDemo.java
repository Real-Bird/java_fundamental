package java_20210518;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static String format(File f) {
		//1970년 1월 1일 00:00:00부터 파일을 수정한 날짜까지의 시간을 밀리세컨드로 반환한 값
		long lastModified = f.lastModified();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(lastModified);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String format = sdf.format(cal.getTime()); //getTime() : Calendar를 Date type으로 변경해주는 메서드
		return format;
	}
	public static void main(String[] args) {
		File f1 = new File("c:\\dev\\test\\2021\\05\\18");
		if(f1.mkdirs()) {
			System.out.println("디렉토리를 생성했습니다.");
		}else {
			System.out.println("이미 디렉토리가 존재합니다.");
		}
		
		File f2 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse.zip");
		long len = f2.length();
		System.out.printf("%,dKB%n", len/1024);
		boolean isFile = f2.isFile(); //isDirectory()
		if(isFile) {
			String path = f2.getPath();
			if(path.endsWith("zip")) {
				System.out.println("압축파일입니다.");
			} else if(path.endsWith("txt")) {
					System.out.println("텍스트파일입니다.");
			} else if(path.endsWith("java")) {
				System.out.println("자바파일입니다.");
			}
		} else {
			System.out.println("디렉토리입니다.");
		}
		
		System.out.println(f2);
		
		File f3 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse2.zip");
		File f4 = new File("c:\\dev\\test\\2021\\05\\18\\eclipse3.zip");
		f3.renameTo(f4); //f3파일명을 f4파일명으로 변경
		
		String path = f4.getPath(); //전체 경로 추출
		String parent = f4.getParent(); //상위 경로까지 추출
		String name = f4.getName(); //파일명만 추출
		System.out.printf("%s, %s, %s %n", path, parent, name);
		
		f4.delete();
		
		
		//파일명, 최종 수정 날짜, 크기, 유형 출력 코드
		File f5 = new File("C:\\Users\\user\\eclipse-workspace\\java_fundamental");
		File[] files = f5.listFiles();
		for (int i = 0; i < files.length; i++) {
			File f = files[i];
			if(f.isDirectory()) {
				String lastModified = format(f);
				String filename = f.getName();
				System.out.printf("%s , %s , 파일폴더%n", filename, lastModified);
			}
		}
		for (int i = 0; i < files.length; i++) {
			File f = files[i];
			if(f.isFile()) {
				String lastModified = format(f);
				String filename = f.getName();
				long fileSize = f.length();
				System.out.printf("%s , %s , %d , 파일%n", filename, lastModified, fileSize);
			}
		}
	}
	}

