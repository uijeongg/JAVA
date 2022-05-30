package kr.ac.kopo.day09;

public class Child01 extends Parent { //parent를 상속받는다
	
	String name = "자식01";
	
	public void print() {
		System.out.println("Child01::print() 호출..."); //오버라이딩
	}

	
	//자식이 자기만 가진 고유한 행위
	public void study() {
		System.out.println("나는 공부합니다");
	}
	
	public void sleep() {
		System.out.println("나는 잡니다");
	}



}
