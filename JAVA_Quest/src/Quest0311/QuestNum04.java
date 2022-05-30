package Quest0311;
import java.util.Scanner;

/*
4. 단을 입력받아 구구단을 출력하세요
2 - 9 단을 입력 : 6

*** 6단 ***
6 * 1 = 6
6 * 2 = 12
...
6 * 9 = 54
*/

public class QuestNum04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 - 9단을 입력 :");
		int dan = sc.nextInt();  // dan: ~단을 의미
		
		System.out.printf("*** %d단 ***\n", dan);
		// 또는 System.out.println();
		
		for(int i=1; i<=9 ; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			
		}
		
	
	}

}



