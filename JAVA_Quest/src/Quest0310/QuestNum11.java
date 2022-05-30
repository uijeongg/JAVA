package Quest0310;
import java.util.Scanner;

/*
 * 11. 정수 4 개를 입력받아 가장 큰수를 출력하는 코드를 작성
정수 4 개 입력 : 12 56 8 34
가장 큰수 : 56 
 */

public class QuestNum11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 4개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();

		// num1이 가장 클 때
		if (num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.print(num1);
		}

		// num2가 가장 클 때
		if (num2 > num1 && num2 > num3 && num2 > num4) {
			System.out.print(num2);
		}

		// num3이 가장 클 때
		if (num3 > num1 && num3 > num2 && num3 > num4) {
			System.out.print(num3);
		}

		// num4가 가장 클 때
		if (num4 > num1 && num4 > num2 && num4 > num3) {
			System.out.print(num4);
		}
	}

}


