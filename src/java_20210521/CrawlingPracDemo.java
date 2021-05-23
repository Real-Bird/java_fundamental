package java_20210521;

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
			String address = "https://en.wikipedia.org/wiki/Social_Progress_Index";
			URL url = new URL(address);
			InputStream in = url.openStream();
			InputStreamReader isr = new InputStreamReader(in);
			doc = Jsoup.connect(address).get();
			System.out.println("성공");

			BufferedReader br = new BufferedReader(isr);
			//FileWriter fw = new FileWriter("C:\\dev\\test\\2021\\05\\23\\Crawling.csv");
			//BufferedWriter bw = new BufferedWriter(fw);
			Elements elements = doc.select(".wikitable tbody tr td a");
			for (Element element : elements) {
				System.out.println(element);
			
			}
			/*String readLine = null;
			while ((readLine = br.readLine()) != null) {
				bw.write(readLine);
				bw.newLine();
			}
			bw.flush();
			*/

		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
