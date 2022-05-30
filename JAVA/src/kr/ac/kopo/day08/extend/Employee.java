package kr.ac.kopo.day08.extend;

public class Employee {
	
	//public String name; //public은 누구나 다 억세스 가능한 변수. 누구나 다 수정할 수 있으므로 보안성이 떨어짐
	String name; //private로 하면 상속관계에서도 못봄. 그냥 여기서만 볼 수 있는 변수가 됨. 매니저 03에서 this.name으로 접근이 불가
	int salary;
	String grade;
	
	Employee() { //매개변수 생성자 만들때 일단 아무것도 안들은 기본생성자를 그냥 만들어줘라 그래야 에러 안뜸
		
	}
	
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}

	
	void info() { //
		
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
		
		
	}
}
