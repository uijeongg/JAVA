package kr.ac.kopo.day11;
import java.util.Scanner;
//throw 발생시점 아닌데 발생했다고 만들고 싶은 목적으로 쓸때
//throw 목적: 예외가 발생하는 시점이 아닌데 예외가 발생했다고 만들고 싶을 때 throw를 쓴다고!
//= API에 정의된 예외상황이 아니라 프로그램 내에서 특별한 예외 상황에 맞는 예외를 정의할 경우 사용

public class ExceptionMain10 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("짝수를 입력 : ");
		int num = sc.nextInt();
		
		if(num < 0 || num % 2 == 1) {
			throw new Exception("짝수가 아닌 정수가 입력되었습니다"); //던지게 하기 위해서 여기서 throw 해줌 // 매개변수가 메시지인 형태
			//그러니까 try catch를 만들어줘야해. 어디다가? 위에 메인메소드에다가 throws Exception 추가
			//그래서 실행시켜서 짝수가 아닌 홀수를 입력시켜주면 예외발생이 뜸
		} 
		} catch(Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수를 입력 : ");
		int num = sc.nextInt();
		
		if(num < 0 || num % 2 == 1) {
			System.out.println("잘못입력했습니다");
		} else {
			System.out.println("짝수 : " + num);
		}
		*/
	}


}