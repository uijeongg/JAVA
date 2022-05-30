package Quest0310;
import java.util.Scanner;
/*
 * 2. 3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오 (키보드입력)
결과출력 : 1시간 1분 1초
 */

public class QuestNum02 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 초인가요? :");
		int time = sc.nextInt();
		
		int hour = time/3600;
		int min = time%3600/60;
		int sec = hour%60;
		
		System.out.print(time + "초는" + hour + "시간" + min + "분" + sec + "초입니다");

	}

}



/*
 * 1. 스캐너 임포트 후 scanner sc 선언  
 * 2. 출력할 문구 선언 sysout
 * 3. 변수 선언 int a 
 */

