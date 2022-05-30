package kr.ac.kopo.day03.exam;

public class Practice08 {

	public static void main(String[] args) {

		for(int i=1 ; i<=5; i++) {
			
			for(int j=1; j<=5-i ; j++) {
				System.out.print("-");
			}
			
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
				
			}
			System.out.println(); //*다 찍은다음에 엔터니까 이 위 괄호에 엔터가 있으면 안됨!
		}


	}

}
