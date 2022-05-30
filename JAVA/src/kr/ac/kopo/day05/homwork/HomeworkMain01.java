package kr.ac.kopo.day05.homwork;
import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums=new int[10];
		int[] sum= new int[2]; //[0]:짝수총합~[1]:홀수총합
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(i+1+"번째 정수 입력 : ");
			nums[i]=sc.nextInt();
			sum[nums[i]%2]+= nums[i];
		}

		String[] title = {"짝수", "홀수"};
		for(int mod=0; mod<=1; mod++) {
			System.out.println("<" + title[mod] + ">");
			for(int i=0; i<nums.length; i++) {
				if(nums[i]%2==mod) {
					System.out.println(nums[i] + " ");
				}
			} System.out.println();
			System.out.println(title[mod] + "총합 : " + sum[mod]);
		}
		
	}

}
