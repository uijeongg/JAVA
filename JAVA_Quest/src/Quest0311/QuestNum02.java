package Quest0311;
import java.util.Scanner;

/*
2. 다음의 결과를 보이는 프로그램 작성하시오.
1 - 100 사이의 정수를 입력 : 40
2 - 10사이의 정수를 입력 : 5

< 1 ~ 40사이의 5의 배수를 제외한 정수 출력>
1 2 3 4 6 7 8 9 11 ... 39

< 1 ~ 40사이의 5의 배수를 제외한 정수 5개씩 출력>
1 2 3 4 6
7 8 9 11 12
...
*/

public class QuestNum02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 - 100 사이의 정수를 입력 : ");
		int i = sc.nextInt();

		System.out.print("2 - 10 사이의 정수를 입력 : ");
		int j = sc.nextInt();

		System.out.println("<1~40 사이의 5의 배수를 제외한 정수 출력>");
		for (int k = 1; k <= 40; k++) {
			if (k % 5 != 0) {
				System.out.printf("%d\t", k); // \t -> tab
			}
		}

		System.out.println();

		System.out.println("<1~40 사이의 5의 배수를 제외한 정수 5개씩 출력>");

		int countNum = 0; // 변수 생성 및 초기화
		for (int l = 1; l <= 40; l++) {
			if (l % 5 != 0) {
				System.out.printf("%d\t", l);

				//int countNum = 0; for문 내부에서 선언하면 x
				//for문 돌때마다 계속 0이 되어버리니까
				countNum++;
				if (countNum % 5 == 0) {
					System.out.println();
				}

			}
		}

	}
}

