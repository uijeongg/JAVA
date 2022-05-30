package kr.ac.kopo.day055;

public class ArrayMain06 {

	public static void main(String[] args) {
		
		//int[][] arr = new int[][]; //배열은 꺽새로 차원구분 -> 2차원 
		
		/*2차원배열은 1차원배열들을 모아놓은 집합이다.
		그럼 3차원배열은 2차원배열들을 모아놓은 집합.
		지금 나는 1차원배열을 모아놓은 2차원배열을 만들고 싶은 상황이다.
		*/
		
		int[][] arr= new int[3][4]; //1차원배열을 총 3개 모아놓은 2차원배열을 만들고 싶어. 인티저는 4개씩 갖고 있는 애들로!

		
		/* 이 위의 코드와 같은말. 풀어놓은 코드
		int[] ar01 = new int[4];
		int[] ar02 = new int[4];
		int[] ar03 = new int[4]; 저 ar010203을 기억하는 ㅂ열을 만들고 싶다고 그럼
		int[][] arr= {ar01,ar02,ar03}; 얘는 배열의 주소값만 가지고 있고, 우리가 접근하는건 int값이어야하잖아? 
		
		ar01은 지가 주소를 갖고 있잖아? 거기에 int[] ar01 꺾새 한번을 붙이면 int를 만날 수 있다는 의미고
		int[][] arr은 그럼 꺾새 두번을 붙여야 int에 접근할 수 있는 것
		
		그럼 실제 heap에는 new를 통해 만들어진게 4개인 것
		*/
		
		
		System.out.println("arr : " + arr + " , arr.length : " + arr.length);
		//arr은 주소값이 찍힐것이고 arr의 길이는 ? 생각해봐 의정아
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr[" +i + "] : + arr[i]");
		}


	}

}
