package kr.ac.kopo.day11;
import java.io.FileReader;

//런타임, 컴파일에러
public class ExceptionMain07 {

public static void main(String[] args) {
		
		System.out.println("main start...");
		
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("loop...");
				if (i == 3) {
					FileReader fr = new FileReader("a.txt"); // checked Exception 이 예외가 발생하면
				}
			} catch (Exception fnfe) { //여기 캐치가 잡아서 리턴을 해주니까 여기서 끝남.
				fnfe.printStackTrace();
				return;
			} finally {  //근데 finally의 end loop도 출력이 됨.
				System.out.println("end loop...");
			}
		}
		System.out.println("main end...");
		}
}


//예외 발생 시켜서 catch가 잡아줘도 finally까지 찍힘. 
//(마지막에 위치한) finally는 무조건 실행!! finally 아닌 마지막 메소드는 출력 안됨
//자원관리에서 자주 사용 -> 얻어온 외부자원들을 관리할때 (예외가 발생하든 안하든 무조건 관리해야 할 때)
