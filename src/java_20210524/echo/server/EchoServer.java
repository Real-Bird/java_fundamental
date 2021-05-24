package java_20210524.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
	private int port;

	public EchoServer(int port) {
		this.port = port;
	}

	public void run() {
		ServerSocket serverSocket = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			// 1. Serversocket 인스턴스 생성
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("[Server Console]");
		while (true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다......");
			try {
				// 2. accept() - 클라이언트 접속 대기
				// 클라이언트 접속 시 통신 가능한 Socket 객체 생성
				Socket socket = serverSocket.accept();
				// 4. 클라이언트 통신 가능한 Socket 객체가 생성됨
				InetAddress i = socket.getInetAddress();
				System.out.println("클라이언트가 접속했습니다[" + i.getHostAddress() + "]");
				// 5. Socket을 이용해 클라이언트와 통신할 수 있는 입출력 스트림 생성
				// 6-2
				InputStream in = socket.getInputStream();
				// 6-3
				OutputStream out = socket.getOutputStream();

				isr = new InputStreamReader(in);
				br = new BufferedReader(isr);
				osw = new OutputStreamWriter(out);
				bw = new BufferedWriter(osw);

				while(true) {
				String readLine = br.readLine();
				System.out.println("클라이언트 메세지 : " + readLine);

				bw.write("그만큼 신나시다는 거지~");
				bw.newLine();
				bw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// 2번 이상 객체를 사용할 경우 아래와 같이 객체 생성
		// EchoServer echoServer = new EchoServer(3000); 
		// echoServer.run();
		new EchoServer(3000).run();
	}
}
