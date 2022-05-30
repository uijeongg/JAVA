package kr.ac.kopo.day04;

public class ArrayMain03 {

	public static void main(String[] args) {
		
		int[] arr= new int[5]; //인트 배열 어레이생성 거기를 5 크기로
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		
		
/*	이 방식은 아래 이유로 쓰이지 않음	. 위의 인덱스로 사용해야함
		int data = 1;
		for(int num : arr) { 
			num = data++;
		}
	*/	
		
		
		//배열은 다 0으로 초기화되니까
		System.out.println("<Print>");
		for(int num : arr) {
			System.out.println(num+ "\t");
		} System.out.println();
		
		/*for(int i = 0 ; i<arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
		System.out.println(); */
		
		
		
	}
	}

//1.5에서 for문은 입력으로는 못씀. 검색, 출력용으로만가능
//int 변수니까 다 0으로 초기화가 돼있었으므로 다 0으로 출력

//1.5버전에서 포문의 특징을 값들을 복사해주는 것. 그래서 아무리 값이 바껴도 걍 num이 바뀔 뿐이지, 복사본이 바뀔 뿐이지 원본은 안바뀜.

