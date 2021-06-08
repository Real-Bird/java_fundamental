package java_20210607;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingPracDemo {
	public static void main(String[] args) {
		try {
			Document doc = null;
			String address = "https://kras.kosha.or.kr/health/health_tab02";
			URL url = new URL(address);
			InputStream in = url.openStream();
			InputStreamReader isr = new InputStreamReader(in);
			doc = Jsoup.connect(address).get();
			System.out.println("성공");
			
			BufferedReader br = new BufferedReader(isr);
			FileWriter fw = new FileWriter("C:\\dev\\test\\2021\\05\\23\\Crawling.csv");
			@SuppressWarnings("resource")
			BufferedWriter bw = new BufferedWriter(fw);
			Elements elements = doc.select("table tbody tr");
			for (Element element : elements) {
				System.out.println(element);
			
			}
			String readLine = null;
			while ((readLine = br.readLine()) != null) {
				bw.write(readLine);
				bw.newLine();
			}
			bw.flush();
			

		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
