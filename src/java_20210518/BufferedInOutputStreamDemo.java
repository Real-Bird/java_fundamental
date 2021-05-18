package java_20210518;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			//FileInputStream과 FileOutputStream을 이용하여 1바이트 읽어서 1바이트 출력한 예제
			//11메가바이트 경과 시간 : 42836 
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9-copy.zip");
			
			//BufferedInputStream과 BufferedOutputStream을 이용하여 1바이트 읽어서 1바이트 출력한 예제
			//BufferedOutputStream의 버퍼(byte[]) 공간에 가득 차 있으면 출력
			//만약 다 채워지지 않으면 출력하지 않음
			//이런 경우 flush() 메서드로 모두 출력해야 함
			//11메가바이트 경과 경과 시간 : 324, flush 전 파일 크기 다름
			//11메가바이트 경과 경과 시간 : 311, flush 후 파일 크기 같음
			//11메가바이트 버퍼 사이즈(1024*100) 경과 시간 : 226
			bis = new BufferedInputStream(fis, 1024*100);
			bos = new BufferedOutputStream(fos, 1024*100);
			
			long start = System.currentTimeMillis();
			int readByte = 0;
			//fis, fos
			/*while((readByte = fis.read())!=-1) {
				fos.write(readByte);
			}*/
			
			//bis, bos
			while((readByte = bis.read()) != -1) {
				bos.write(readByte);
			}
			bos.flush();
			
			//fis, fos byte[] 11메가바이트 경과 시간 : 15 
			/*int readByteCount = 0;
			byte[] readBytes = new byte[1024*10];
			while((readByteCount = fis.read(readBytes))!= -1) {
				fos.write(readBytes, 0, readByteCount);
			}*/
			long end = System.currentTimeMillis();
			System.out.printf("경과 시간 : %d %n", (end-start)); 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//닫을 때는 안의 것부터 닫아야 안전.
				if(fis != null) fis.close();
				if(bis != null) bis.close();
				if(fos != null) fos.close();
				if(bos != null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
