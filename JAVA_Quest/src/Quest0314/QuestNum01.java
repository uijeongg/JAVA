package Quest0314;
import java.util.Scanner;

/*
   1. 5개의 정수를 입력받아 다음과 같이 출력하시오
1's num : 12
2's num : 5 
3's num : 8 
4's num : 30 
5's num : 22 
< PRINT >
12 5 8 30 22
 */

public class QuestNum01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr;
		arr = new int[5];

		System.out.print("1's num : ");
		arr[0] = sc.nextInt();
		System.out.print("2's num : ");
		arr[1] = sc.nextInt();
		System.out.print("3's num : ");
		arr[2] = sc.nextInt();
		System.out.print("4's num : ");
		arr[3] = sc.nextInt();
		System.out.print("5's num : ");
		arr[4] = sc.nextInt();

		System.out.println("< PRINT >");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}

