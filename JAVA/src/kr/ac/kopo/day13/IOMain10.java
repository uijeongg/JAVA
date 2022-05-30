package kr.ac.kopo.day13;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

//네이버 홈페이지 코드 읽어오기
public class IOMain10 {

	public static void main(String[] args) {

		try {
			URL urlObj = new URL("https://www.naver.com");

			FileWriter fw = new FileWriter("iotest/naver.html");
			PrintWriter pw = new PrintWriter(fw);

			InputStream is = urlObj.openStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			while (true) {
				int c = isr.read();
				if (c == -1)
					break;
				System.out.print((char) c);
				pw.print((char) c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//이렇게 짜주니까 iotest파일에 네이버.html 파일이 생겼음
//io형태로 웹브라우저가 날라옴. 파일 가서 확인해보면 네이버 웹브라우저가 들어가있음
//io가 이렇게 중요합니다