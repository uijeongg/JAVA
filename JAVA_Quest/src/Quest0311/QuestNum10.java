package Quest0311;

/*
10. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
*-------*
**-----**
***---***
****-****
*********
****-****
***---***
**-----**
*-------*
*/


//교수님 설명

//5를 기준으로 양쪽이 데칼코마니 형태로 접근
//그리고 개수는 다르지만 한 줄에 총 9개는 동일
public class QuestNum10 {

	public static void main(String[] args) {

		int star = 1; // 별의 개수
		for(int i = 1; i <= 9; i++) { // 일단 9줄 찍을거야

			for (int j=1; j <= 9; j++) {
				if (j <= star || j >= 10-star) {
					System.out.print('*');
				} else {
					System.out.print('-');
				}

			}

			System.out.println();
			if (i < 5)
				star++;
			else
				star--; // 5를 기준으로 star가 증가하다가 감소
		}

	} 
}
	
	



/* 나의 멋진 실패작
 for(int i=1 ; i<=9 ; i++) {
			
			if(i<=4) {
				for(int j=1; j<=9-2*i ; j++) {
					System.out.print("-");
				}
				
				for(int k=1 ; k<=i ; k++) {
					System.out.print("+");
				}
				
			}  else if(i==5)  {
					 {
						int j=0;
						System.out.print("-");
					}
					int k=9;
				    System.out.print("+");
					
				} else {
					for(int j=1; j<=2*i-11 ; j++) {
						System.out.print("-");
					}
					for(int k=9 ; k>=i ; k--) {
						System.out.print("+");
					}
				} System.out.println();
 */


