package Quest0310;
import java.util.Scanner;

/*
 * 10. 정수 3 개를 입력받아 큰수에서 작은수순으로 출력하는 코드를 작성
첫번째 정수 : 12
두번째 정수 : 26
세번째 정수 : 16
26 16 12
 */


//교수님방법
import java.util.Random; //숫자를 랜덤하게 가져오기 위한 패키지

public class QuestNum10 {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int num1= r.nextInt(30)+1; //0~29가 아니고 1~30 사이의 숫자를 뽑으려고 +1해줌
		int num2= r.nextInt(30)+1;
		int num3= r.nextInt(30)+1;
		
		System.out.println(num1 + ":" + num2 + ":" + num3);
		
		int max = num1;
		int min = num2;
		if (num1 < num2) {
			max = num2;
			min = num1;
		}
		
		if (num3 > max) {
			System.out.printf("%3d%3d%3d\n" + num3, max, min);
		} else if (num3 > min) {
			System.out.printf("%3d%3d%3d\n",max,num3,min);
		} else {
			System.out.printf("%3d%3d%3d\n",max,min,num3);
		}
				
		
		
	}

	
}
