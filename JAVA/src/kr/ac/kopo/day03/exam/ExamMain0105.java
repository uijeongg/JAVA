package kr.ac.kopo.day03.exam;

public class ExamMain0105 {

	public static void main(String[] args) {
		
		// 54321을 찍고싶다
		
		int num=5;
		for(int i=1 ; i<=5; i++) {
		//for(int i=5 ; i>=1; i--) { //동일
			
			System.out.println(num--); //변수num으로 선정해주고 싶으니까 위에서 값 할당해줘야함 -> 5할당해주고 거기서 감소해
			//sysout(6-i) 도 동일
		}
		System.out.println();

	}

}

