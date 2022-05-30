package kr.ac.kopo.day01;

/*
    기본자료형
    논리형:boolean 
    문자형:char
    정수형:byte, short, int(기본), long
    실수형:float, double(기본)
    
    순서1. 변수선언
    - 자료형 쓰고 변수명 쓰고 세미콜론
    - 자료형 변수형 ;
    ex) char a;
    
    순서2. 변수대입
    변수명 = 값; 대입해주기
    
    변수초기화(선언과 동시에 값 대입)
    자료형 변수명 = 값;
    
    
    같은 자료형의 변수 여러개 선언
    자료형 변수명1, 변수명2, 변수명3 ...;
 */




public class VariableMain {
	
	char b; //메소드 안 말고 클래스 안에 선언된 변수는 "멤버변수" -> 자동초기화 o
	
	public static void main(String[] args) {
		
		//대문자 A를 저장하기 위한 변수 a선언 
		char a; //메소드 안에서 선언된 변수는 "지역변수" -> 얘네는 초기화가 자동으로 설정 안됨 
		
		
		//System.out.println(a); a라는 공간을 만들었는데 그 공간에 가진 값은 없을 때 => "가비지 밸류값"
		a = 'A' ; //a를 A로 초기화 한 것?
		
		//정수 123을 저장하기 위한 변수 c선언
		int c = 123;
		
		//실수 3개를 저장하기 위한 변수 d1,d2,d3 선언;
		//double dl;
		//double d2;
		//double d3;
		//double d1, d2, d3;
		
		
		//double d1, d2 = 12.34, d3;
		
		//여러개변수를 동시에 초기화 할 땐 하나 빼놓지 말고 다 같이 초기화 해주는게 좋다
		
		System.out.println(a); 
		System.out.println(c); 
		//System.out.println(b); //이건 static 메소드 안에서 선언된게 아니라서 여기선 에러 
		
	}

}
