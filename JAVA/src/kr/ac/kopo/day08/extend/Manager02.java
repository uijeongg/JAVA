package kr.ac.kopo.day08.extend;

// 관리자(Manager02)는 사원의 한 형태이다 라는 조건 부합 -> 상속관계로 표현 가능
public class Manager02 extends Employee {
	
	
	Employee[] empList; //관리사원 목록을 저장하려는 목적의 배열 생성

	Manager02() {} //기본생성자 만들어 !!
	
	Manager02(String name, int salary, String grade, Employee[] empList) {
		
		//super(); //눈에 보이지 않지만 슈퍼라는 생성자를 호출한다
		
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	@Override
	void info() {
		super.info();
		
		System.out.println("------------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("------------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("------------------------------------------");
}
}
