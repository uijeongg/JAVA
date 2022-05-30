package kr.ac.kopo.day13;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//문자열로 반환시켜서 출력하는 메소드
//InputStreamReader
public class IOMain02 {

	public static void main(String[] args) {

		InputStream is = System.in;

		InputStreamReader isr = new InputStreamReader(is);
		// '가' 는 2바이트인데 나는 한글자만 읽은 값을 아스키코드로 출력해서 이상한 글자 나옴. 아스키 두개씩을 묶어 읽어야 한글임.
		// InputStreamReader : byte를 입력하면 걔네를 두개씩 묶어서 char형을 변환해서 출력해줌

		System.out.print("키보드 입력을 하세요. ctrl+z 입력시 종료"); // ctrl+z 하면 키보드 입력받는 행위를 그만 두겠다는 의미

		while (true) {
			try {
				int c = isr.read(); // 바이트 스트림이 아닌 문자를 읽어야 하니까 isr로 읽어야함
				if (c == -1)
					break;
				System.out.print((char) c);
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}
}


//엔터가 line feed와 carriage return 둘 다를 가짐

//프루시: 통로에 남아있는 데이터들을 쭉 빼서 출력해주는 메소드 
//플루시로 쫙 밀어서 내보내줌