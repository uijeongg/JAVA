package Quest0311;

/*
  ********* 
  -*******-
  --*****--
  ---***---
  ----*----
  ---***---
  --*****--
  -*******-
  *********
   
 */

public class QuestNum1002 {

	public static void main(String[] args) {
		
		int space=0; //++로 설정해줄거니까 9말고 0
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j<=space || j>=10-space) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			} System.out.println();
			if(i<5) 
				space++; //--아니고 ++인 이유 생각해보기
			else
				space--;
		}

	}

}




/*
   int space=1; //++로 설정해줄거니까 9말고 0
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j<=space-1 || j>=9-space) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			} System.out.println();
			if(i<5) 
				space++; //--아니고 ++인 이유 생각해보기
			else
				space--;
		}
*/
