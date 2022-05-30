package kr.ac.kopo.day03.exam;

public class Practice06 {

	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--) {
			
			for(int j=1 ;j<=i ; j++) { //j는 개수니까 5개부터 시작하면 6-i로 해서 어렵게 가야함 그니까 1로 시작하는게 나음
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
