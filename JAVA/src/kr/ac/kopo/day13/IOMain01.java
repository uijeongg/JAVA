package kr.ac.kopo.day13;
import java.io.IOException;
import java.io.InputStream;
public class IOMain01 {

	public static void main(String[] args) {

		InputStream is = System.in;
		System.out.print("키보드 입력을 하세요. ctrl+z 입력시 종료"); //ctrl+z 하면 키보드 입력받는 행위를 그만 두겠다는 의미


		//int c = is.read(); //정수형으로? 한글자씩 읽어오고 싶음
		while(true) {
			try {
				int c = is.read();
				//System.out.print(c);
				if(c==-1) break; //-1이면 break로 나가라
				System.out.print((char)c); //int값을 char로 형변환
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

//엔터가 line feed와 carriage return 둘 다를 가짐 그래서 

//가 는 2바이트인데 나는 한글자만 읽은 값을 아스키코드로 출력해서 이상한 글자 나옴