package Quest0311;

/*
5. 구구단을 출력하세요
*** 2단 ***
2 * 1 = 2
...
2 * 9 = 18

*** 3단 ***
...
9 * 9 = 81
*/

public class QuestNum05 {
	public static void main(String[] args) {

		for (int dan = 1; dan <= 9; dan++) {

			System.out.printf("*** %d단 ***\n", dan);

			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
			System.out.println(); //단 사이에 공백

		}

	}

}

/*
   전체가 한번에 나오도록 만들어야 하니까
   저 단을 출력하는 문장도 for문 안에 들어가야 반복되면서 나올 수 있다!
   
   입력받는 값 없으니까 scanner도 필요 x
 
 */


