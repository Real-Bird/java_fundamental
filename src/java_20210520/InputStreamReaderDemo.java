package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		/*
		InputStream in = System.in; //source가 키보드인 경우
		byte[] b = new byte[100];
		
		System.out.print("입력하세요> ");
		int readByteCount = 0; 
		while((readByteCount = in.read(b))!= -1) { //keyboard 엔터 칠 때까지 대기
			String message = new String(b, 0, readByteCount);
			if(message != null && message.trim().equals("quit")) break;
			System.out.print(message);
			System.out.print("입력하세요> ");
		}
		*/
		
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in); //1byte를 2byte로 변경
		BufferedReader br = new BufferedReader(isr); //1줄씩 읽어오기 위해 stream chaining
		FileWriter fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\message.txt", true);
		BufferedWriter bw = new BufferedWriter(fw); //1줄씩 읽어오기 위해 stream chaining
		
		String readLine = null;
		System.out.print("입력하세요> ");
		while((readLine = br.readLine()) != null ) {
			if(readLine != null && readLine.equals("quit")) break;
			System.out.println(readLine); //readLine에는 개행이 없으므로 println()
			bw.write(readLine);
			bw.newLine();
			System.out.print("입력하세요> ");
		}
		bw.flush();
	}
}
