package kr.ac.kopo.day09.abs02;

public abstract class Printer {
	
private String model;
	
	public Printer() {
		
	}
	public Printer(String model) {
		this.model = model;
	}
	
	public abstract void print();
	//셋 다 print()메소드 쓰게 강제성 부여해주려고 만듦.
	//내용은 안들었으니까 abstract
	//추상메소드가 들었으니까 여기 클래스 자체도 abstract붙어야함
	//엘지랑 삼성은 에러없는데 hp는 에러가뜸. 추상클래스를 상속받은 크래스는 반드시 추상클래스를 ㅇ버라이딩해야하는데
	//얘는 오버라이딩 한게 없어서.
	}


