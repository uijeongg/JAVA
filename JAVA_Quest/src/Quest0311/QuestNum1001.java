package Quest0311;

/*
  ****-****
  ***---***
  **-----**
  *-------*
  ---------
  *-------*
  **-----**
  ***---***
  ****-**** 
  
  
 */

public class QuestNum1001 {

	public static void main(String[] args) {

		int star = 4; // 별의개수
		for (int i = 1; i <= 9; i++) { // 일단 9행 만들어줌
			for (int j = 1; j <= 9; j++) {
				if (j <= star || j >= 10 - star) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
			if (i < 5)
				star--;
			else
				star++;
		}
	}
}


