package kr.ac.kopo.day03.exam;

public class Practice10 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			if (i <= 5) {
				for (int j = 1; j <= 6 - i; j++) {
					System.out.print("*");
				}

				// System.out.println();
			} else {
				for (int j = 1; j <= i - 4; j++) {
					System.out.print("*");

				}
				// System.out.println();

			}
			System.out.println();
		}
	}
}


//sysout을 둘다 써줘야하는게 맞음. 각 줄마다 엔터가 들어가야하니까.
//그런데 아예 포문 밖에서 써주면 한번에 끝낼 수 있음.

//정렬코드 컨트롤 쉬프트 에프