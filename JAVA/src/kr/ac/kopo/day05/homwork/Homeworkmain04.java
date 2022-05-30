package kr.ac.kopo.day05.homwork;

import java.util.Scanner;

public class Homeworkmain04 {

	public static void main(String[] args) {
		
			
			int[] nums = new int[5];
			Scanner sc = new Scanner(System.in);
			
			String msg = "";
			for(int i = 0; i < nums.length;) {
				System.out.print(i+1 + "번째 정수 입력 : ");
				nums[i] = sc.nextInt();
				if(i > 0 && nums[i] < nums[i-1]) {
					System.out.println(msg + "보다 큰수여야합니다");
				} else {
					msg += nums[i++] + " ";
				}
			}


		System.out.println("< PRINT >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i = nums.length-1; i >= 0; i--) {
			// nums[i] = 25 ==> 52
			//reverse해주려면 10의자리수와 1의자리수를 분리시켜야지
			int n10 = nums[i] / 10; //10의자리수는 10으로 나눈 몫
			int n1  = nums[i] % 10; //1의자리수는 10으로 나눈 나머지가 되겠지
			System.out.print(n1*10 + n10 + "\t");
		}
		System.out.println();
	}


}
