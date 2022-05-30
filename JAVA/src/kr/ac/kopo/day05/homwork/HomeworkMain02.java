package kr.ac.kopo.day05.homwork;
import java.util.Scanner;

public class HomeworkMain02 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			//큰지 여부를 판단해야하니까 nums[i] > nums[0]~nums[i-1]
			for(int j=0; j<i; j++) {
				if(nums[i] < nums[j]) {
					System.out.println();
				}
			}
		}

	}

}
