package java_20210521;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=104&oid=437&aid=0000266864");
		URLConnection urlCon = url.openConnection();
		
		String cacheControl = urlCon.getHeaderField("cache-control");
		String contentType = urlCon.getHeaderField("content-type");
		String date = urlCon.getHeaderField("date");
		
		System.out.println("cache-control : " + cacheControl);
		System.out.println("contentType : " + contentType);
		System.out.println("date : " + date);
		
		InputStream in = urlCon.getInputStream();
		
		InputStreamReader isr = new InputStreamReader(in ,"EUC-KR");
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("C:\\dev\\test\\2021\\05\\21\\HtmlOutput.html");
		BufferedWriter bw = new BufferedWriter(fw);
		String readLine = null;
		while((readLine = br.readLine()) != null) {
			System.out.println(readLine);
		}
	}
}
