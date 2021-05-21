package java_20210521;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://imgnews.pstatic.net/image/437/2021/05/21/0000266864_001_20210521114507556.jpg?type=w647");
		URL url2 = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=104&oid=437&aid=0000266864");
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String ref = url.getRef();
		System.out.println("protocol : " + protocol);
		System.out.println("host : " + host);
		System.out.println("port : " + port);
		System.out.println("path : " + path);
		System.out.println("query : " + query);
		System.out.println("ref : " + ref);
		
		InputStream in = url.openStream(); // source : image
		InputStream in2 = url2.openStream(); // source : html
		int readByteCount = 0;
		byte[] readBytes = new byte[1024 * 8];
		FileOutputStream fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\21\\ImageOutput.jpg");
		
		while((readByteCount = in.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteCount);
		}
		fos.close();
		
		InputStreamReader isr = new InputStreamReader(in2 ,"EUC-KR");
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("C:\\dev\\test\\2021\\05\\21\\HtmlOutput.html");
		BufferedWriter bw = new BufferedWriter(fw);
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
			bw.write(readLine);
			bw.newLine();
		}
		bw.flush();
		
		isr.close();
		br.close();
		fw.close();
		bw.close();
	}	
}
