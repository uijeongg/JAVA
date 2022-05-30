package Quest0311;


/*
8. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
반복문 5개, 조건문 1개 이용가능
반복문 3개, 조건문 3개
반복문 3개, 조건문 1개
반복문 2개, 조건문 2개
*****
-****
--***
---**
----*
---**
--***
-****
*****
*/

public class QuestNum08 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			if (i <= 5) {
				for (int j = 1; j <= i - 1; j++) {
					System.out.print("-");
				}
				for (int j = 1; j <= 6 - i; j++) {
					System.out.print("*");
				}
			}

			else {
				for (int j = 1; j <= 9 - i; j++) {
					System.out.print("-");
				}
				for (int j = 1; j <= i - 4; j++) {
					System.out.print("*");
				
				}
			}System.out.println();
		}
		

	}

}
