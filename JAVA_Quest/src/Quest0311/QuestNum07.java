package Quest0311;

/*
7. 구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. 이때 10단은 나오면 안됩니다. 
반복문은 최대 3개만 사용합니다.
2 * 1 = 2 3 * 1 = 3 4 * 1 = 4
2 * 2 = 4 3 * 2 = 6 4 * 2 = 8
...
5 * 1 = 5 6 7
...
8 9

for(int dan = 2; dan <= 9; ) {
}
*/

public class QuestNum07 {
	public static void main(String[] args) {

		/*for (int dan = 2; dan <= 9; dan++) {

			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);

			}
			System.out.println();

		}
		
		//위의 for문 끝난 영역에서 생성
		for (int countNum = 1; countNum <= 9; countNum++) {
			if (countNum % 3 == 0) {
				System.out.println();

			}
		}
*/
		
		
		for(int dan=2; dan<=9; dan +=3)  {//3단씩 증가?
			
			for(int i=1; i<=9 ; i++) {
				int j = 9;
				System.out.printf("%d * %d = %d\t", dan+j, i, (dan+j)*i); 
				//2*1에서 2*2로 내려가기 전에 3*1을 찍어야함
				System.out.printf("%d * %d = %d\t", dan+++j, i, dan*i); 
				System.out.printf("%d * %d = %d\n", dan, i, dan*i); 
			}
			System.out.println();
		}
		
		
		
		
	}
}

//종류2개있음 - 위에코드/step사용
