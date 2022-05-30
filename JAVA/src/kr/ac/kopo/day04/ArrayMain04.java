package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		
		
		//배열 초기화(이미 만들어진 배열에 값을 바꿔주고 싶을 때)
	//	int[] arr= {10,20,30,40,50} ; 방법1
		int[] arr = new int[] {10,20,30,40,50}; // 방법2
		
		
		// arr = {5,4,3}; //배열 선언 후 다시 543을 가진 배열을 재선언하고 싶은 경우. 근데 이건 에러야. 
		arr = new int[]{5,4,3}; //뉴 인트랑 같이 선언해줘야 사용가능해야함 
		
		System.out.println("arr: " + Arrays.toString(arr));
		

	}

}
