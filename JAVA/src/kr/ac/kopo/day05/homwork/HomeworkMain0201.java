package kr.ac.kopo.day05.homwork;
import java.util.Scanner;


public class HomeworkMain0201 {
	
	
	public static void main(String[] args) {
		
			
			int[] nums = new int[5];
			Scanner sc = new Scanner(System.in);
			
			String msg = "";
			for(int i = 0; i < nums.length;) {
				System.out.print(i+1 + "번째 정수 입력 : ");
				nums[i] = sc.nextInt();
				if(i > 0 && nums[i] < nums[i-1]) {  //i가 0번지이면 인덱스가 -1이 되므로 에러뜸. 그래서 i>0이라는 논리 붙여줘야 함
					System.out.println(msg + "보다 큰수여야합니다");
				} else {
					msg += nums[i++] + " ";
				}
			}
			
			/*
			for(int i = 0; i < nums.length; i++) {
				System.out.print(i+1 + "번째 정수 입력 : ");
				nums[i] = sc.nextInt();
				if(i > 0 && nums[i] < nums[i-1]) {
					for(int j = 0; j < i; j++) {
						System.out.print(nums[j] + " ");
					}
					System.out.println("보다 큰수여야합니다");
					i--;
				}
			}
			*/
		}
	








	}


