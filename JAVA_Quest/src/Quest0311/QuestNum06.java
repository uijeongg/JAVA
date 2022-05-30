package Quest0311;
import java.util.Scanner;

/*
6. 시작단과 종료단을 입력받아 구구단을 출력하시오.
시작단을 입력 : 5 
종료단을 입력 : 8 

*** 5단 ***
5 * 1 = 5
...
8 * 9 = 72 

이 때, 시작단을 8, 종료단을 5을 입력해도 같은 결과가 나와야 합니다
*/

public class QuestNum06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작단을 입력: ");
		int start = sc.nextInt(); // 시작 받는 입력값 따로 선언

		System.out.print("종료단을 입력: ");
		int end = sc.nextInt(); // 끝 받는 입력값 따로 선언

		
		//시작단-끝단 순일 경우
		if (start <= end) { 

			for (int dan = start; dan <= end; dan++) { // 각 단 제목 출력
				System.out.printf("*** %d단 ***\n", dan);

				for (int i = 1; i <= 9; i++) { // 각 단의 구구단 출력
					System.out.printf("%d * %d = %d\n", dan, i, dan * i);
				}
				System.out.println();

			}

		//끝단-시작단 순일 경우
		} else {

			for (int dan = end; dan <= start; dan++) {
				System.out.printf("*** %d단 ***\n", dan);

				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n", dan, i, dan * i);
				}
				System.out.println();
			}

		}

	}


}
