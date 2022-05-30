package Quest0314;
import java.util.Scanner;

/*
   2. 10개의 정수를 입력받아 출력
 1's num : 12
 2's num : 5 
 3's num : 8 
 4's num : 30 
 5's num : 22 
 6's num : 87 
 7's num : 9 
 8's num : 4 
 9's num : 15 
 10's num : 22
 
 < 짝수 >
 12 8 30 22 4 22
 짝수의 총합 : XXX
 
 < 홀수 >
 5 87 9 15 
 홀수의 총합 : XXX

 */

public class QuestNum02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr;
		arr = new int[10];
		int even = 0;
		int odd = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "'s num : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("< 짝수 >");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even += arr[i];
				System.out.printf("%d", arr[i]);
			}

		}
		System.out.println("짝수의 총합 : " + even);

		System.out.println("< 홀수 >");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				odd += arr[i];
				System.out.printf("%d", arr[i]);
			}

		}
		System.out.println("홀수의 총합 : " + odd);
	}
}
