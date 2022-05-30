package kr.ac.kopo.day09;

//c는 a랑 상관이 없음
//c는 연결된 

class A {
	A() {
		System.out.println("A() 호출...");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("B() 호출...");
	}
}

class C extends B {
	C() {
		System.out.println("C() 호출...");
	}
}

public class ExtendsMain02 {

	public static void main(String[] args) {
		
//		new A();
//		new B();
		new C();
	}
	
}
