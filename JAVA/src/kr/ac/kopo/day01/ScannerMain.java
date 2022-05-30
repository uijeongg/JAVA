package kr.ac.kopo.day01;


import java.util.Scanner; //여기서 Scanner를 가지고 와서 사용할거다

public class ScannerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //참조자료형이니까 대문자시작, 그리고 new를 통해 써야함
		
		
		
		
		System.out.print("정수를 하나 입력하세요 : ");
		int a = sc.nextInt(); //키보드로 입력받은 정수를 출력하고 싶을 때 사용하는 메소드
		
		System.out.println("a : " + a);
		System.out.print("문자열을 입력 : ");
		String str = sc.nextLine(); // 엔터
		str = sc.nextLine(); // 입력받은 문자열
		
		System.out.println("str : " + str);
		//next는 문자 단위 하나하나로 인식함
		//그래서 문자열을 Hello World를 치면 Hello만 인식
		
		System.out.println("문자열을 입력 : ");
		String str1 = sc.nextLine();
		System.out.println("str : " + str1);
		//nextLine으로 문자열인식 됨 
		//그래서 문자열을 Hello World를 치면 Hello World 모두 인식
		
		
		System.out.println("문자열을 입력 : ");
		char ch = sc.nextLine().charAt(0);   //이 메소드 생긴건 그냥 암기
		System.out.println("ch : " + ch);
		
		
		sc.close();
		
		
		
				
		
	}

}

//스캐너메인이라는 소프트웨어가 아직 안끝났으면 우하단 빨간버튼이 on
//왜냐면 입력값을 치라했는데 아직 그걸 안쳤으니까 기다리고 있는거지 int a = sc.nextInt();
//System.out.print("정수를 하나 입력하세요 : "); 그래서 입력값 받기 전에 이렇게 글 하나 써줘야 좋음
//sc.nextInt(); 처럼 sc.next~(); 다 있는데 sc.nextCha();는 없음