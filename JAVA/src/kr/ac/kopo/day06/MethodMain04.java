package kr.ac.kopo.day06;
import java.util.Scanner;
//Gugudan클래스랑 연결

public class MethodMain04 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("2-9사이의 단을 입력: ");
		int dan = sc.nextInt();
		//int dan = gu.getDan(); 겟단 만들고 난 이후로는 이렇게도 사용 가능
		
		
		
		Gugudan gu = new Gugudan();
		gu.print(dan);

		
		gu.print(); // 구구단 클래스에서 전체 구구단 뽑는거 여기 페이지에선 이렇게만 써줘도 출력 됨 -> 오버로드

		System.out.print("시작단 입력: ");
		int startDan = gu.getDan();

		System.out.print("끝단 입력: ");
		int endDan = gu.getDan();

		System.out.println(startDan + " : " + endDan);

	}

}
