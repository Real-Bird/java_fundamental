package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("C:\\dev\\test\\2021\\05\\18\\FileDemo.java");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\FileDemo4.java");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true); //auto flush
			
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				pw.println(readLine); //개행 포함
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(pw != null) pw.close();
				
				File before = new File("c:\\dev\\test\\2021\\05\\18\\FileDemo4.java");
				File after = new File("c:\\dev\\test\\2021\\05\\18\\FileDemoCopy.java");
				before.renameTo(after);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
