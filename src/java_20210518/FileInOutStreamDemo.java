package java_20210518;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//매개변수 path에 파일이 존재하지 않으면 예외 발생
			//
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\eclipse.zip");
			
			//매개변수 path의 디렉토리가 존재하지 않으면 예외 발생
			//예외가 발생하지 않고 객체가 생성되면 파일 생성
			//이때 무조건 빈파일을 생성함
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\eclipse-copy1.zip");
			
			/*int readByte = 0;
			long start = System.currentTimeMillis();
			//read()는 1바이트 읽어서 읽은 바이트를 반환한다.
			while((readByte = fis.read())!=-1) {
				//write()는 1바이트 쓰기
				fos.write(readByte);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과 시간 : %d %n", (end-start));*/ //531메가바이트 경과 시간 : 2071854 
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*10];
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과 시간 : %d %n", (end-start)); //531메가바이트 경과 시간 : 773 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
