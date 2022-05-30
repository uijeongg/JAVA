package kr.ac.kopo.day06;
//MethodMain04랑 연결해서 보기

import java.util.Scanner;

public class Gugudan {

	void print(int dan) {

		System.out.println("*** " + dan + "단 ***");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + '=' + (dan * i));

		}

	}

	void print() { // 2-9단 전체 출력하고싶어서 만드는 메소드
		// 근데 printAll로 안만들어주고 그냥 print라고 해줘도 메소드 오버로딩을 통해서 가능

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);

			}
		}
		
		
		print(2); // 근데 이게 2단출력해줘
		print(3); // 3단출력해줘 ......9단 그소리잖아 그럼
		for (int dan = 2; dan <= 9; dan++) {
			print(dan); // 이렇게 print(dan)으로 출력할 수도 있지 않아?
		}

	}
	
	
	
	
	
	
	int getDan() { //겟단이 하나의 단을 입력받음. 여기에 스캐너 필요하겠지
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		return dan;
	}

}
