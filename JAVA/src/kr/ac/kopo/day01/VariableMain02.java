package kr.ac.kopo.day01;

public class VariableMain02 {
	
	public static void main(String[] args) {
		
		// "Hello" 문자열을 저장하기 위한 변수 str 선언
		//String str; //참조자료형은 다 대문자로 시작해야함. 왜냐면 참조자료형은 다 class 안에서 선언되는데 class의 명명규칙이 적용되겠지
		//str = "Hello";
		
		//String str = "Hello"; //변수초기화??????????????????
		
		String str = new String("Hello"); //
		/*헬로라는 공간을 만들거야. new라는 공간에 -> new는 heap에 있지 -> 힙은 공간 대표이름이 없음
		그래서 heap에 접근하기 위해 대입값 주소 0x50 을 힙에 대입해주는 것. 그때 0x50이 str이고 그 선언문이 String str = new ~
		그래서 str이 참조변수인것. 실제 자리를 아는게 아니고 위치값을 통해서 접근하는 것이니까
		힙영역의 공간을 알기위해 new가 필요한것
		
		string 클래스가 유일하게 뉴를 안써도 되긴 하지만 그래도 원리는 같음.
	
		str은 원래 0x50인데 str은 저 위치에서 Hello 라는 값을 저장중이니까 그렇게 연결이 되는 것
		
		*/
		
		System.out.println(str);
		
		//Test t = new Test();//힙영역의 테스트의 공간을 만듦. 걔는 0x80인데 그 위치값을 기억하기 위해 
//		System.out.println(t);
		//힙영역의 주소값을 기억하고 있는 것
		
		//@ (엣)붙으면 무조건 주소
		
	}

	
}
