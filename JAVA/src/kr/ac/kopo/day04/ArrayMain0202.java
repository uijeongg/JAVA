package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain0202 {

	public static void main(String[] args) {
		
		String[]strArr = new String[5];
		strArr[0]="데이터분석";
		strArr[1]="자바";
		strArr[2]="교육";
		strArr[3]="짱";

		/*
		 * 배열의 전체 원소를 출력 방식 
		 * 1. index를 이용한 출력 (원소접근: 0~length-1)
		 * 
		 * 2. 1.5버전의 for문을 이용한 출력
		 * 
		 * 3. Arrays.toString() 메소드를 이용한 출력 java.util.Arrays 임포트해야함
		 * 
		 * 
		 */

		System.out.println("<index를 이용한 출력>"); // 5개짜리 배열인데 실제값은 0123에 들어있어서 4는 null
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}

		System.out.println("<1.5버전의 for문 이용 출력>");
		for (String s : strArr) { // for(배열의 변수를 받을 수 있는변수선언 : 배열명) strArr배열에 있는 string 형의 s 선언/ strArr 에 있는 모든
									// 원소를 처음부터 다 접근하려고 해. 그걸 s라는 변수로 억세스하는 개념
			System.out.println(s); // for문을 통해 한바퀴씩 돌면서 인덱스 0 1 2 에 쭉 돎
		}

		System.out.println("<Arrays.toString() 메소드를 이용한 출력>");
		String result = Arrays.toString(strArr); // 이 메소드는 저 배열 strArr가 가진 모든 요소를 하나의 문자열을 만들어줌
		// "[원소, 원소, 원소, ...]" 형식으로 출력됨
		System.out.println(result); // 이렇게 result를 위에서 선언하고 받아서 사용하면 됨

	}

}
