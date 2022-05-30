package kr.ac.kopo.day11;
import java.io.FileNotFoundException;
import java.io.FileReader;

//런타임, 컴파일에러
public class ExceptionMain06 {

	public static void main(String[] args) {

		System.out.println("main start...");
		String str = null;
		System.out.println(str.length()); // str이 null이라서 길이가 없어 -> (런타임)에러
		System.out.println("main end...");

		// --------------------

		System.out.println("main start...");

		try {
			FileReader fr = new FileReader("a.txt"); // 컴파일 에러 -> checked Exception
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}

		System.out.println("main end...");

	}
}

//런타임시점 에러: 코드 쓸때는 예외인지 모르는데, 이걸 실행해봐야만 알 수 있는 에러
//네트웍 연결 안돼있다거나 파일억세스 이런건(외부장치연결의 경우) 뻔히 보이잖아 에러가
//컴파일 때 바로바로 에러가 보이는 것 : 컴파일시점 에러
//꼭 예외처리 해야하는 컴파일시점에러 애들은 반드시 try catch 블럭으로 잡아줘야함 안해주면 에러

//예외발생시켜도 finally는 찍힘. 
//finally는 무조건 실행
