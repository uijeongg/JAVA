package Quest0310;
import java.util.Scanner;

/*
 * 3. 반지름이 10인 원의 면적을 구해서 출력하시오(키보드입력)
참고 : 원주율 – 3.141592
결과출력 : 원의 면적은 143.1234 입니다.
 */

public class QuestNum03 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//반지름 입력
		System.out.print("반지름을 입력하세요 :");
		int r = sc.nextInt(); //변수선언은 sysout 후에!!!!
		
		// 결과값 입력
		final double pi = 3.141592; //final(상수): 이 상수값은 바뀌지 않아야 한다
		double result = pi * r * r ;
		System.out.printf("원의 면적은 %.4f 입니다.", result); //소숫점넷째자리

	}

}
