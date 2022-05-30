package kr.ac.kopo.day055;

import java.util.Arrays;

public class ArrayMain07 {

	public static void main(String[] args) {

		int[][] ar = new int[3][]; // 주소값이 비어있는 상태.
		// 1차원배열 세개를 만들었는데 그 안에 값이 안 들어있는 형태잖아. 그럴땐 그 값이 null인거야

		for (int i = 0; i < ar.length; i++) {
			ar[i] = new int[3 + i]; // ar이 있는데 new에 의해서 3개짜리 일차배열만 만든거야
			// for문을 통해서 이렇게 만들어주면 ar[0] [1] [2]의 length가 다 달라지겠지. 차례대로 3,4,5 크기
		}

		for (int[] arr : ar) {// 원소의 타입이 int배열 arr인거
			System.out.println(arr);
		}

		System.out.println("=====각 인덱스의 크기가 다른 상태에서 int 각각에 값 대입 ========");

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = i * 10 + (j + 1);
			}
			System.out.println();
		}

		//방법1
		for (int[] arr : ar) { // arr이 각각의 1차원배열. 이제 그들의 각각의 원소에 접근하고 싶어. 그게 목적!!
			System.out.println(Arrays.toString(arr));
			
		}

		//방법2
		for(int i=0; i<ar.length; i++) {
			for(int num : ar[i]) {  //일차배열
				System.out.print(num + " ");
			} System.out.println();
		}
	}
}
