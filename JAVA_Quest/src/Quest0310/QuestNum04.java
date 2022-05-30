package Quest0310;
import java.util.Scanner;

/*
 *4. 화면에서 하나의 정수를 입력 받고 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 화면
에 출력하시오
정수를 입력하세요 : 10
나눌 수를 입력하세요 : 7
몫 : 1
나머지 : 3 
 */

public class QuestNum04 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int a = sc.nextInt();
		
		System.out.print("나눌 수를 입력하세요 :");
		int b = sc.nextInt();
		
		System.out.println("몫 :" + a/b);
		
		System.out.println("나머지 :" + a%b );

	}


}
