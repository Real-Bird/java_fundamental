package java_20210520;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class TistoryScanningDemo {
	public static void main(String[] args) throws IOException {
		//URL 읽어오기
		URL url = new URL("https://jamesdreaming.tistory.com/99");
		InputStream in = url.openStream();
		
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		FileWriter fw = new FileWriter("C:\\dev\\test\\2021\\05\\18\\jamestistory.html");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String james = null;
		while((james = br.readLine()) != null) {
			System.out.println(james);
			bw.write(james);
			bw.newLine();
		}
		bw.flush();
	}
}
