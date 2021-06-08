package java_20210608;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("C:\\dev\\test\\2021\\05\\18\\apache-tomcat-9.0.46.zip");
		
		long len = file.length();
		System.out.printf("%,dk %n", len/1024);
		
		String fileName = file.getName();
		System.out.printf("%s %n", fileName);
		
		String name = fileName.substring(0, fileName.indexOf("."));
		System.out.printf("%s", name);
		
		String extention = fileName.substring(0, fileName.indexOf("."));
		System.out.printf("%s", name);
		String extension = "";
	}
}
