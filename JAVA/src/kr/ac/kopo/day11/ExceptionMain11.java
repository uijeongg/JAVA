package kr.ac.kopo.day11;
// 내가만든 나만의 mis ~ 예외처리 메서드



//나만의 예외클래스를 만들고 싶다면 exption클래스를 상속받아서 내가 정의하면 됨
//나만의 것을 만든다 -> 원래는 예외가 아니라고
//그럼 예외로 만들어야 하는데 그 과정을 throw를 통해 떠넘겨서 가능하다고!



import java.util.Scanner;

class MismatchEvenException extends Exception {

	public MismatchEvenException() {
		super();
	}

	public MismatchEvenException(String message) {
		super(message);
	}
	
}



public class ExceptionMain11 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("짝수를 입력 : ");
			int num = sc.nextInt();

			if (num < 0 || num % 2 == 1) {
				throw new MismatchEvenException(num + "은 짝수가 아닙니다");
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


