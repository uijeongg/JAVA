package kr.ac.kopo.day08.extend;

// 관리자(Manager02)는 사원의 한 형태이다 라는 조건 부합 -> 상속관계로 표현 가능
public class Manager03 extends Employee { //뒤에 있는게 부모(임플로이)
	
	
	Employee[] empList; //관리사원 목록을 저장하려는 목적의 배열 생성

	Manager03() {
		super();
	} //기본생성자 만들어 !!

	Manager03(String name, int salary, String grade, Employee[] empList) {
		
		super(name, salary, grade); //눈에 보이지 않지만 슈퍼라는 생성자를 호출한다
		this.empList = empList;
	}
		
		
		
	@Override 
	void info() {
		super.info();  //만약 void info(int a)이면 매개변수 안맞아서 오버라이드가 아님. 그걸 @Override 가 에러라고 찾아내서 잡아줌
		//this.info(); //여기서 info()부르면 기본으로 일단 this가 불러짐. -> 그니까 자기 안에 있는 자기를 계속 호출해주는게 되는 것
		//내 메소드가 아닌 부모거 갖다 쓰고 싶다면
		//super.info(); //그냥 info부르면 메소드 오버라이딩때문에 자꾸 자기것만 불러내짐. 그게 아니라 엄마거 갖다 쓰기 위해서 super 쓴다고
		
		
		//임플로이 클래스(부모)에 있는걸 여기 자식 info()가 갖다쓰려는데 그 이름이 동명이라서 슈퍼를 써주는거
		//=오버라이딩
		
		System.out.println("-------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("--------------------------------------");
	
	}
	
	
	}



