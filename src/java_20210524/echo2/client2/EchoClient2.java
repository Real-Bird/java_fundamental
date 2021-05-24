package java_20210524.echo2.client2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient2 {
	private String ip;
	private int port;

	public EchoClient2(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public String console(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	

	public void run() {
		Socket socket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		System.out.println("[Client Console]");
		try {
			// 3. ip와 port로 서버에 접속을 시도
			socket = new Socket(ip, port);
			// 4. TCP connection
			System.out.println("서버와 연결되었습니다.");
			// 6. Socket을 이용해 서버와 통신할 수 있는 입출력 스트림 생성
			// 6-1
			OutputStream out = socket.getOutputStream();
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
			// 6-4
			InputStream in = socket.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);

			while (true) {
				String message = console("메세지> ");
				bw.write(message);
				bw.newLine();
				bw.flush();
				
				String readLine = br.readLine();
				System.out.println("서버 메세지 : " + readLine);
			}
		} catch (IOException e) {
			System.err.println("서버 접속에 실패했습니다.");
		}

	}

	public static void main(String[] args) {
		// cmd -> ipconfig -> IPv4 -> 192.168.0.63(교육장) 
		new EchoClient2("192.168.0.63", 3000).run();
	}
}
