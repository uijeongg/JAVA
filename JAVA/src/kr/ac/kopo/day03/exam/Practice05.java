package kr.ac.kopo.day03.exam;

public class Practice05 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1 ; j<=i; j++) { //1행일때 1개 2행일때 2개 ... 이면 i행일땐 i개 찍으면 되지
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
