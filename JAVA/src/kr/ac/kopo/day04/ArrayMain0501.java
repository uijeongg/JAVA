package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain0501 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,50,70,30};
		//int[] copy = arr; //arr배열의 카피본을 만들고 싶다. 카피 배열도 arr이 가진 값을 갖고 싶다. 그럼 =arr 일케 해서 가지면 될거 아냐 ==> 쉘로우 카피
		
		int[] copy = new int[arr.length];                     //공간을 만들고
		
		//System.arraycopy(arr,0, copy,0, arr.length); 아래의 포문으로 복사 안하고 메소드를 사용해서도 알아서 복사해줌 -> java.lengh 패키지는 (시스템 어쩌고로 시작하는 메소드)임포트 안해도 사용 가능 -> 애넨 jdk?실행 시 자동으로 열림
		for(int i = 0; i<arr.length; i++) {                     //공간을 복사하는 중
			copy[i] = arr[i];
			
		}
		
		System.out.println("arr : " + arr); //얘네 둘이
		System.out.println("copy : " + copy); //주소값 다른거 확인됨
		
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(arr)); 
		
		copy[2] = 100; // 카피의 2번지의 값을 바꿔주고 다시 찍어봤더니
		System.out.println("arr : " + Arrays.toString(arr));  //각각 다름. 하나가 다른 하나의 변화에 영향을 받지 않음
		System.out.println("copy : " + Arrays.toString(arr)); //이게 바로 deep copy

	} //참조변수가 가진 값을 복사하는것이 deep copy (깊은 복사)
	//참조변수를 복사하는 것은 shallow copy

}
//깊은 복사의 특징