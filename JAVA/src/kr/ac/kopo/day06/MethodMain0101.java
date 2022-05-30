package kr.ac.kopo.day06;

public class MethodMain0101 {

	static void printStar(char ch , int cnt) { //메소드 선언부 정의부
		System.out.println("**********"); 
		
		//프린트는 호출자 메소드가 문자하나와 정수하나를 넘겨줍니다.
		//우리는 이 문자를 정수개 만큼 찍어주는게 목적
		//문자 - 숫자 순이어서 무조건 주고받을 때도 그 순서로 해줘야함 '*',10
		
		
	}
		                                 

		
	public static void main(String[] args) {
		
		printStar('*', 10); // printStar가 가진 문장을 정의하고 싶을 땐 () / 메인이 피호출자 프린트스타에게 10만큼 찍으라고 전달
		System.out.println("Hello");
		printStar('-', 20); //메인이 피호출자 프린트스타에게 20만큼 찍으라고 전달
		System.out.println("Hi");
		printStar('+', 20);
		System.out.println("Bye");
		printStar('*', 10); //두개 넘겨주고 싶으면 콤마로 연결
		//이렇게 숫자만이 아니라 기호도 같이 넘겨주려면 위에서 char ch , int cnt 이렇게 같이 선언. 콤마로 연결
		
		
		//printStar()에 정수값을 넘겨주면 그건 메인->프린트스타에 정수를 보내는 것.
		//그 개수만큼 별을 찍고 인터찍겠지
		//(10) 이니까 정수가 필요. 그래서 static void printStar(int cnt) 로 int cnt 선언
		//기호도 같이 넘겨주려면 위에서 char ch , int cnt 이렇게 같이 선언. 콤마로 연결
		
		//매개변수 = 파라미터

	}

}
