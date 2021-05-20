package java_20210520;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null; // file
		PrintStream ps1 = null; // monitor

		ps1 = System.out;
		ps1.println("Hello");

		try {
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
			bis = new BufferedInputStream(fis); // stream chaining
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9-copy.zip");
			bos = new BufferedOutputStream(fos); // stream chaining

			// PrintStream
			// 1. PrintStream의 메서드는 IOException을 발생하지 않음
			// 2. auto flush 기능을 가지고 있음 => true
			ps = new PrintStream(bos, true); // stream chaining

			int readByte = 0;
			while ((readByte = bis.read()) != -1) {
				ps.write(readByte);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
				if (bis != null) bis.close();
				if (fos != null) fos.close();
				if (ps != null) ps.close();
				if (bos != null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
