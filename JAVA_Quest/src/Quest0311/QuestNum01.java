package Quest0311;

import java.util.Scanner;
/*
1. 정수를 입력받아 1에서부터 입력받은 정수사이의 숫자를 출력하는 코드를 작성
1 - 100사이의 정수를 입력 : 60

< 1 ~ 60 정수 출력 >
1 2 3 .... 60
*/

public class QuestNum01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int num = sc.nextInt();
		
		System.out.printf("<1 ~ %d 정수 출력>", num);
		System.out.println();
		
		for(int i= 1 ; i<=num; i++) {
			System.out.print(i + " "); //변수와 문자열을 함께 써줄 땐 +로 연결, 공백 " " 
		}
		
	}

}