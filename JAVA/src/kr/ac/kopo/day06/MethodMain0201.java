package kr.ac.kopo.day06;

class Method {
	
	//메소드 오버로딩 : 같은 클래스 내에서 메소드 명이 같으면서 매개변수의 개수나 타입이 서로 다른 메소드들 
	//즉 자바는 메소드 오버로딩 기능을 제공한다
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) { //call()이라는 같은 이름의 메소드여도 안에 인자가 있으니까 에러가 안남
		               //자바는 메소드와 메소드를 구분하는 구분자 역할을 => 메소드와 메소드명+매개변수의 타입
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(d) 메소드 호출...");
	}
	
	void call(String str, int n) {
	System.out.println("call(String, int) 메소드 호출...");
}



public class MethodMain0201 {

	//public static void main(String[] args) {
		//1. 메서드 객체의 인스터스객체를 만들어야지
		Method m = new Method();
//		m.call(); //그럼 여기서 호출 됨

//		m.call(10); //이건 int를 가진 두번째 메소드 -> 함 출력해서 봐봐 
//		m.call(10.3);
		
		//근데 여기서 묵시적형변환을 통해서 더블형은 인트형을 가질 수 있잔항
		//그래서 인트형 메소드도 더블형으로 받음
		
//		m.call("hello",5);
	}

}
//}

