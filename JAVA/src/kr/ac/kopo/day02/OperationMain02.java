package kr.ac.kopo.day02;
import java.util.Scanner; //컨트롤 쉬프트 알파벳o 누르면 자동 임포트됨
/* 
 *  a 입력 : 10
 *  b 입력 : 3
 *  
 *  10이 3의 배수인가? False
 *  
 *  a 입력 : 10
 *  b 입력 : 5
 *  
 *  10이 5의 배수인가?
 * 
 */

public class OperationMain02 {

	
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	// Scanner sc = new Scanner(System.in);  임포트 처음에 안해줬으면 에러메세지에서 임포트 하라고 그거 누르면 알아서 쳐줌
		
		System.out.print("a 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("b 입력 : ");
		int b = sc.nextInt();
		
		boolean result = (a % b == 0) ; // 불린의 결과값이 그 답이겠지 
		
		System.out.printf("%d가 %d의 배수인가? %b\n", a, b, result);
		
		
		//boolean result = (b != 0 && a % b == 0) ; //b가 0일 땐 a/b하면 안되잖아
		//System.out.printf("%d가 %d의 배수인가? %b\n", a, b, result); 

	}

}
