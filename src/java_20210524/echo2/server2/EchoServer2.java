package java_20210524.echo2.server2;

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

public class EchoServer2 {
	private int port;

	public EchoServer2(int port) {
		this.port = port;
	}

	public void run() {
		ServerSocket serverSocket = null;
		//유니캐스트 방식의 네트워크
		EchoServerThread est = null;
		
		try {
			// 1. Serversocket 인스턴스 생성
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("[Server2 Console]");
		while (true) {
			System.out.println("클라이언트 접속을 대기하고 있습니다......");
			try {
				// 2. accept() - 클라이언트 접속 대기
				// 클라이언트 접속 시 통신 가능한 Socket 객체 생성
				Socket socket = serverSocket.accept();
				
				est = new EchoServerThread(socket);
				Thread t = new Thread(est);
				t.start();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// 2번 이상 객체를 사용할 경우 아래와 같이 객체 생성
		// EchoServer echoServer = new EchoServer(3000); 
		// echoServer.run();
		new EchoServer2(3000).run();
	}
}
