package kr.ac.kopo.day05.homwork;
import java.util.Scanner;

/*
5. 다음의 결과를 보이는 프로그램을 작성하시오
int[] nums = {1,2,3,4,5};
Left(-), Right(+) : +
Start Index(0 - 4) : 3
< PRINT >
4 5 1 2 3
Left(-), Right(+) : -
Start Index(0 - 4) : 1
< PRINT >
2 1 5 4 3 
*/

public class HomeworkMain05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = {1, 2, 3, 4, 5};
		
		System.out.println("< BEFORE >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.print("Left(-), Rigth(+) : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print("Start Index(0-4) : ");
		int index = sc.nextInt();
		
		System.out.println("< AFTER >");
		if(ch == '+') {
			for(int i = index; i < nums.length; i++) {
				System.out.print(nums[i] + "\t");
			}
			for(int i = 0; i < index; i++) {
				System.out.print(nums[i] + "\t");
			}
		} else if(ch == '-') {
			for(int i = index; i >= 0; i--) {
				System.out.print(nums[i] + "\t");
			}
			for(int i = nums.length-1; i > index; i--) {
				System.out.print(nums[i] + "\t");
			}
		}
		System.out.println();
	}
}





