package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		
		int[] arr = {10,20,50,70,30};
		int[] copy = arr; //arr배열의 카피본을 만들고 싶다. 카피 배열도 arr이 가진 값을 갖고 싶다. 그럼 =arr 일케 해서 가지면 될거 아냐 ==> 쉘로우 카피
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(arr)); //찍어보면~ 나오지 ==> 카피가 잘 됐구낭~
		
		copy[2] = 100; // 카피의 2번지의 값을 바꿔주고 다시 찍어봤더니
		System.out.println("arr : " + Arrays.toString(arr));  //copy만 수정해줬는데 arr배열도 copy배열도 둘 다 수정됨.
		System.out.println("copy : " + Arrays.toString(arr)); //왜? copy도 arr의 주소값까지 다 가져갔기 때문에. copy도 arr랑 똑같이 값을 가리킴. 그러니까 값을 가리키고 있는 참조변수가 두개인것.
		//하나의 공간을 두개의 참조변수가 가리키게 만든 것임 ==> "shallow copy" (얕은 복사) 
		//같은 한 공간을 둘이 같이 쉐어 중이니까 카피나 어레이 둘 중에 하나에 변화를 줘도 둘다 영향을 받게 되는 것
		
 

	}

}
