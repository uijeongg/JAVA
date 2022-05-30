package kr.ac.kopo.day04;

public class ArrayMain01 {

	public static void main(String[] args) {
		
		int[] arr; //인티저 배열 저장하기 위해서 'stack'에 어레이 배열 만들거야
		
		arr = new int[5]; //정수 5개를 가지는 배열을 생성하고싶다 --> 이건 'heap'에 저장
		                  //int 5개짜리 배열의 주소를 arr이 기억하게 만들겠다 
		                  //돌려보면 @붙은 주소값이 뜸

		//arr = new int[10]; //주소값 바꿔줌
		System.out.println("arr : "+ arr); //arr의 주소를 찍는 코드
		//자동초기화는 new 를 썼을때만 가능해서 arr 이런 변수들은 초기화가 안돼있음. 
		//new저거 안써주고 그런 변수를 찍으면 에러가 남
		
		System.out.println("배열의 원소 총 개수 :" + arr.length + "개"); //원소의 총 개수를 '변수이름.length'로 구할 수 있음
		System.out.println("첫번째 원소 : " + arr[0]);
		System.out.println("두번째 원소 : " + arr[1]);
		System.out.println("세번째 원소 : " + arr[2]);
		System.out.println("네번째 원소 : " + arr[3]);
		System.out.println("다섯번째 원소 : " + arr[4]); //new로 만든건 다 값이 초기화 되고, 인티저는 그게 0이라서 이 인덱스 다 0으로 출력됨
		
		
		for(int i=0; i<5; i++) { //인덱스는 0부터 시작하므로 변수로 사용가능하고, for문쓸때 인덱스의 약자로 i를 쓰는 것 //그래서 사실은 i=0으로 초기화하는게 더 일반적 
	    //for(int i=0; i<=arr.length; i++) { // 위처럼 5라고 쓰는게 위험할 수 있으니까 length로 접근하는게 더 안정적
			System.out.println(i + "번째 원소 : " + arr[i]);
		}System.out.println("-----");
			   
		
		//각 원소값에 10 20 30 40 50 값을 대입
		//1차원배열에서 원소값에 접근하는 방식
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//위와 같은 대입을 이렇게 for문을 통해서도 접근 가능
		for(int i=0; i<arr.length; i++) {  
			arr[i] = (i+1) *10;
		}
		
		
		for(int i=1; i<arr.length; i++) {  //i를 1부터 해줘서 0번째 인덱스는 출력되지 않는 중
			System.out.println(i + "번째 원소 : " + arr[i]);
		}
	
	
	}

}
